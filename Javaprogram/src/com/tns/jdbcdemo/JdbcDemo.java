package com.tns.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		//load the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("loaded driver");
						
		
		//Get connection
		Connection con=DriverManager.getConnection("jdbc:postgresql:"
				+"//localhost:5432/shadan","postgres","ayesha01");		
		System.out.println("connection established");
		
		//create statement 
		Statement stmt=con.createStatement();
		
		//write the query
		String sql="selet * FROM stud";
		
		//read the data 
		ResultSet rs=stmt.executeQuery(sql);
		
		//traverse through the table 
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ "\t" +rs.getString(2)
			                            +"\t"+rs.getString(3));
		}
		
		//close statement
		stmt.close();
		
		//close connection
		con.close();
		
		
	}

}
