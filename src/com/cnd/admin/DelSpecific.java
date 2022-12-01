package com.cnd.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DelSpecific
 */
public class DelSpecific extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelSpecific() {
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
		
		int ID = Integer.parseInt(request.getParameter("ID"));
		try
		{
			Connection con = ConnectDB.Connect();
			PreparedStatement ps1=con.prepareStatement("delete from addvehicle where Vehicle_No=?");
			ps1.setInt(1, ID);
			int res =ps1.executeUpdate();
			if (res>0){
				response.sendRedirect("viewall.jsp");
			}
			else{
				response.sendRedirect("404.html");
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
