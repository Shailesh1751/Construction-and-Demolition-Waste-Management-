package com.cnd.user;

import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cnd.admin.ConnectDB;
import com.cnd.admin.getset;

/**
 * Servlet implementation class RCNDrequest
 */
public class RCNDrequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RCNDrequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int cndid=0;
		String rtitle=request.getParameter("title");
		String rdesp=request.getParameter("description");
		String radd=request.getParameter("address");
		String status ="Pending";
		String remail=getset.getRemail();
		
		
		
		
		try
		{
			Connection con = ConnectDB.Connect();
			PreparedStatement ps1= con.prepareStatement("insert into cndrequest values (?,?,?,?,?,?)");
			ps1.setInt(1,cndid);
			ps1.setString(2,rtitle);
			ps1.setString(3, rdesp);
			ps1.setString(4,radd);
			ps1.setString(5, status);
			ps1.setString(6, remail);
			

			
			int res=ps1.executeUpdate();
			if(res>0)
			{
				//System.out.println("Failed to Add Vehicle");
				 response.sendRedirect("index.html");
			} else
			{
				//System.out.println("Account created Succesfully");
				response.sendRedirect("404.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}		
	}

}
