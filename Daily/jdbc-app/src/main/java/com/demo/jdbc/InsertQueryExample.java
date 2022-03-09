package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryExample {
	public static void main(String[] args) {
		Connection conn=null;
		try {
		Class.forName("org.mariadb.jdbc.Driver");
		
		conn=DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "root");
		if(conn!=null)
			System.out.println("Connected to Database");
		
		PreparedStatement pst=conn.prepareStatement("delete from employee where empno=?");
		pst.setInt(1, 110);
		
		int count=pst.executeUpdate();
		System.out.println("rows deleted "+count);
		
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
