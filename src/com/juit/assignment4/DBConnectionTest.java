package com.juit.assignment4;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class DBConnectionTest {
	
	static DBConnection dbConnection = null;
	
	@BeforeClass
	public static void setUp() {
		dbConnection = new DBConnection("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@localhost:1521:xe", "root", "wipro"); 
	}
	@Test
	public void testDbConnection() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		
		assertNotNull(con);
	}

}
