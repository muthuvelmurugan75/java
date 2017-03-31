package com.work.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_demo1 {

	

		static final String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		static final String username="system";
		static final String password="oracle"; 

		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			Connection con = DriverManager.getConnection(dbUrl, username, password); 
			 System.out.println("Oracle DB connection established successfully");
		}
		
	}


