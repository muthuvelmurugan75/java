package com.tricky.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Compare_two_values_one_input_and_another_from_a_database {
	
		static final String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
		static final String username="SYSTEM";
		static final String password="oracle"; 

		public static void main(String[] args) throws SQLException {
			Connection con = DriverManager.getConnection(dbUrl, username, password); 
			 System.out.println("Oracle DB connection established successfully");
		PreparedStatement ps=con.prepareStatement("SELECT * FROM C4");
		ResultSet rs=ps.executeQuery();

	
		while(rs.next()){
			
		
		
		String dbValue,inputValue;

		dbValue = rs.getString("NAME");//from db

		inputValue = "UVI";//input value
		System.out.println(rs.getString("NAME"));


		if(dbValue!=null && inputValue!=null){


		if(dbValue.equalsIgnoreCase(inputValue)){

		System.out.println("values are same…");
		}
		
		}

		}
	}}