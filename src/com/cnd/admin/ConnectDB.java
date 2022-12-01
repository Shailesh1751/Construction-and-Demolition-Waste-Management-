package com.cnd.admin;

import java.sql.*;

public class ConnectDB {
	public static Connection con = null;
	public static Connection Connect()
	{
		try
		{
			
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wastemanagement","root","");
				System.out.println("DB Connect Succesfully");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return con;
	}
//	public static void main(String k[]){
//		ConnectDB con = new ConnectDB();
//		Connection conn= con.Connect();
//	}
}

