package com.sapient.question3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoJdbcImpl implements CustomerDao {
	
	@Override
	public Customer findCustomerById(int custId) {
		Customer c=new Customer();
		Connection con=null;
		try {
		con=getConnection();
		PreparedStatement pst = con.prepareStatement("select * from customer where custid=?");
		pst.setInt(1, custId);

		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			c.setCustId(rs.getInt("CUSTID"));
			c.setCustName(rs.getString("CUSTNAME"));
			c.setAddress(rs.getString("ADDRESS"));
			c.setAccountNo(rs.getInt("ACCOUNTNO"));
			c.setBalance(rs.getDouble("BALANCE"));
		}
		System.out.println("Added");
		} catch (ClassNotFoundException e1) {
			System.out.println("Database not found");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return c;
	}

	@Override
	public String save(Customer c) {
		String message = "";
		Connection con = null;

		try {
			con = getConnection();

			PreparedStatement pst = con.prepareStatement("insert into customer(custid,custname,address,accountno,balance) values(?,?,?,?,?)");
			pst.setInt(1, c.getCustId());
			pst.setString(2, c.getCustName());
			pst.setString(3, c.getAddress());
			pst.setInt(4, c.getAccountNo());
			pst.setDouble(5,c.getBalance());

			pst.executeUpdate();

			message = "Customer saved successfully";

		} catch (ClassNotFoundException ex) {
			System.out.println("Driver not found..");
		} catch (SQLException ex) {
			ex.printStackTrace();
			message = "Customer could not be saved..";
		} finally {
			try {
				con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return message;
	}

	@Override
	public String update(int accountNo,double balance) {
		Connection conn = null;
		String message="";
		try {
			
			conn = getConnection();

			PreparedStatement pst=conn.prepareStatement("update customer set balance=? where accountno=?");
			pst.setDouble(1, balance);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			
			message="Customer Updated Successfully";

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found..");
		} catch (SQLException e) {
			e.printStackTrace();
			message="Customer could not be updated";
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return message;
	}

	@Override
	public String delete(int customerId) {
		Connection conn = null;
		String message="";
		try {
			conn = getConnection();
			PreparedStatement pst=conn.prepareStatement("delete from customer where custid=?");
			pst.setInt(1, customerId);
			pst.executeUpdate();
			
			message="Customer deleted successfully";

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found..");
		} catch (SQLException e) {
			e.printStackTrace();
			message="Customer could not be deleted";
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return message;
	}

	@Override
	public List<Customer> listAll() {
		List<Customer> custList = new ArrayList<Customer>();
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement pst = con.prepareStatement("select * from customer");

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Customer c = new Customer();
				c.setCustId(rs.getInt("CUSTID"));
				c.setCustName(rs.getString("CUSTNAME"));
				c.setAddress(rs.getString("ADDRESS"));
				c.setAccountNo(rs.getInt("ACCOUNTNO"));
				c.setBalance(rs.getDouble("BALANCE"));
				custList.add(c);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found..");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return custList;

	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("org.mariadb.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb","root","root");
		return con;
	}

}
