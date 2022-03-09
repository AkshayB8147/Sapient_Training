package com.sapient.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer1 {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb","root","root");
			PreparedStatement pst=con.prepareStatement("insert into customer(custid,custname,address,accountno,balance) values(1001,'Akshay','Hubli',100100123,5000)");
			int count=pst.executeUpdate();
			System.out.println(count);
		
		} catch (ClassNotFoundException e1) {
			System.out.println("Class not found");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
