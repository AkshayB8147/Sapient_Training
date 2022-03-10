package com.sapient.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer2 {
	public static void main(String[] args) {
		
		Connection con=null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mariabd://localhost:3306/sapientdb","root","root");
			
			PreparedStatement pst=con.prepareStatement("insert into customer(custid,custname,address,accountno,balance) values\r\n" + 
					"(1002,'Akash','Harihar',100100234,6000),\r\n" + 
					"(1003,'Hemanth','Hospet',100100345,9000),\r\n" + 
					"(1004,'Bharat','Gadag',100100456,8000),\r\n" + 
					"(1005,'Ajay','Raichur',100100567,10000),\r\n" + 
					"(1006,'Harish','Bangalore',100100678,9000)");
			pst.executeUpdate();
			System.out.println("Rows added "+5);
			
		} catch (ClassNotFoundException e1) {
			System.out.println("Database Not Found");
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
