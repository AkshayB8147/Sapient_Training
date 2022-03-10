package com.sapient.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer5 {
	public static void main(String[] args){
		Connection conn=null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "root");

			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from customer");

			while(rs.next()) {
				
				int custId=rs.getInt("CUSTID");
				String custName=rs.getString("CUSTNAME");
				String address=rs.getString("ADDRESS");
				int accountno=rs.getInt("ACCOUNTNO");
				double balance=rs.getDouble("BALANCE");
				
				System.out.println(custId+"  "+custName+"  "+address+"  "+accountno+"  "+balance);
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

	} 
}
