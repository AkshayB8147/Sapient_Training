package com.demo.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public class EmpDaoJdbcImpl implements EmpDao {

	public Emp findById(int empId) {
		Emp emp=new Emp();
		
		Connection conn=null;
		try {
		conn=getConnection();		
		PreparedStatement pst = conn.prepareStatement("select * from employee where empno=?");
		pst.setInt(1, empId);

		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			emp.setEmpId(rs.getInt("EMPNO"));
			emp.setEmpName(rs.getString("NAME"));
			emp.setEmpCity(rs.getString("ADDRESS"));
			emp.setEmpSal(rs.getDouble("SALARY"));

		}
		
		} 
		catch(ClassNotFoundException e) {
		System.out.println("Driver not found");
		} 
		catch(SQLException e) {
		System.out.println("");
		e.printStackTrace();
		} 
		finally {
			try {
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		return emp;
	}

	public String save(Emp e) {
		String message = "";
		Connection conn = null;

		try {
			conn = getConnection();

			PreparedStatement pst = conn
					.prepareStatement("insert into employee(empno,name,address,salary) values(?,?,?,?)");
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getEmpName());
			pst.setString(3, e.getEmpCity());
			pst.setDouble(4, e.getEmpSal());

			int count = pst.executeUpdate();

			message = "Emp saved successfully";

		} catch (ClassNotFoundException ex) {
			System.out.println("Driver not found..");
		} catch (SQLException ex) {
			ex.printStackTrace();
			message = "Emp could not be saved..";
		} finally {
			try {
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return message;
	}

	public String update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	public String delete(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Emp> listAll() {
		List<Emp> empList=new ArrayList<Emp>();
		Connection conn=null;
		
		try {
			conn=getConnection();
			PreparedStatement pst=conn.prepareStatement("Select * from employee");
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				Emp emp=new Emp();
				emp.setEmpId(rs.getInt("EMPNO"));
				emp.setEmpName(rs.getString("NAME"));
				emp.setEmpCity(rs.getString("ADDRESS"));
				emp.setEmpSal(rs.getDouble("SALARY"));
				empList.add(emp);
			}
			
		} catch(ClassNotFoundException e) {
			System.out.println("Driver not found");
		} catch(SQLException e) {
			System.out.println("");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		return empList;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "root");
		if(conn!=null)
			System.out.println("Connected to Database");
		
		return conn;
		
	}

}
