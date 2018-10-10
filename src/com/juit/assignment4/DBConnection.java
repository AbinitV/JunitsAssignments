package com.juit.assignment4;

import java.sql.*;

public class DBConnection {
	
	String driverName;
	String url;
	String userName;
	String password;
	
	
	

	public DBConnection(String driverName, String url, String userName, String password) {
		super();
		this.driverName = driverName;
		this.url = url;
		this.userName = userName;
		this.password = password;
	}




	public Connection getConnection() throws ClassNotFoundException, SQLException {    
			Class.forName(this.driverName);  
			    
			Connection con=DriverManager.getConnection(this.url,this.userName,this.password);  
			return con;
	}
}
