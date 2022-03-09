package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQueryExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			// get the connection
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sapientdb", "root", "root");

			PreparedStatement pst=conn.prepareStatement("update employee set salary=? where empno=?");
			pst.setDouble(1, 50000);
			pst.setInt(2, 10);
			
			int count=pst.executeUpdate();
			
			System.out.println("Rows updated : "+count);

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found..");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
