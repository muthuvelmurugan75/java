package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconnection.Dbcon;

public class AcceptAtTimeAllRequestInMysql extends Thread{
	static PreparedStatement ps2=null;
	static Connection con=null;
	static Connection con1=null;

	
	public static void main(String[] args) throws SQLException {

		String key="";


		   try{
		 
		   

	   
	   
	   con=Dbcon.create();
		 ps2=con.prepareStatement("SELECT * FROM `cc07`.`task`");
	   
		ResultSet rs1=ps2.executeQuery();
String n="accept";
		while(rs1.next()){
			
			key=rs1.getString(2);
			if(key!=null){
				   con1=Dbcon.create();

				PreparedStatement ps3=con1.prepareStatement("UPDATE cc07.task t SET status='"+n+"' WHERE name='"+key+"'");
				Thread.sleep(3000);
ps3.executeUpdate();
				
				System.out.println("success");
			}
			else{
				System.out.println("error");
			}
			
			System.out.println(key);

	}
		   }
		   catch(Exception e){
e.printStackTrace();		   }
		   
		   
		   
}
	
	}
	

