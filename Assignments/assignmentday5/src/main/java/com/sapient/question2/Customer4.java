package com.sapient.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer4 {
	public static void main(String[] args) {

		Connection con=null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mariabd://localhost:3306/sapientdb","root","root");

			PreparedStatement pst=con.prepareStatement("delete from customer where custid=?");
			pst.setInt(1, 100100567);
			pst.executeUpdate();
			System.out.println("Row Deleted");

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
