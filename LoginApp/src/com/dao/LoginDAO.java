package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {
	
	public Connection getConnection()
	{
		Connection con=null;
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return con;
	}
	public boolean fetch(String uname,String pass)
	{
		System.out.println(uname+"  "+pass+"  "+getConnection());
		boolean b=false;
		try {
			Statement st=getConnection().createStatement();
			String sql="select *from logingithub where uname='"+uname+"' and pass='"+pass+"'";
			ResultSet rs=st.executeQuery(sql);
			System.out.println(sql);
			if(rs.next())
			{
				b=true;
			}
			else
			{
				b=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

}
