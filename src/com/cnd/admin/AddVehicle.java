package com.cnd.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class AddVehicle
 */
public class AddVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVehicle() {
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
		
		int ID=0;
		String dname=request.getParameter("dname");
		String cno=request.getParameter("cno");
		int vno=Integer.parseInt(request.getParameter("vno"));
		double lat=Double.parseDouble(request.getParameter("lat"));
		double log=Double.parseDouble(request.getParameter("log"));
		
		if(vno>0){
		try
		{
			Connection con = ConnectDB.Connect();
			PreparedStatement ps1= con.prepareStatement("insert into addvehicle values(?,?,?,?,?,?)");
			ps1.setInt(1,ID);
			ps1.setString(2,dname);
			ps1.setString(3, cno);
			ps1.setInt(4,vno);
			ps1.setDouble(5, lat);
			ps1.setDouble(6, log);
			
			int res=ps1.executeUpdate();
			if(res>0)
			{
				//System.out.println("Failed to Add Vehicle");
				 response.sendRedirect("welcome.html");
			} else
			{
				//System.out.println("Account created Succesfully");
				response.sendRedirect("addvehicle.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}	
	}else
	{
		response.sendRedirect("404.html");
	}
	}

}
