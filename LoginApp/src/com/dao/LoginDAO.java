package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class LoginDAO {
	
	public Connection getConnection()
	{
		Connection con=null;
		try {
		
			Class.forName("");
    con=DriverManager.getConnection("","","");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return con;
	}

}
