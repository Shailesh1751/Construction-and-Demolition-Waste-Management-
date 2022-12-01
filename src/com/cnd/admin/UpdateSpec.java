package com.cnd.admin;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateSpec
 */
public class UpdateSpec extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSpec() {
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
		
		
		String DriName = request.getParameter("DriName");
		String  DriCno = request.getParameter("DriCno");
		int VNo=Integer.parseInt(request.getParameter("VNo"));
		
		try
		{
			Connection con = ConnectDB.Connect();
			PreparedStatement ps1=con.prepareStatement("update addvehicle set Name=? , ContactNo=? where Vehicle_No=?");
			ps1.setString(1,DriName);
			ps1.setString(2, DriCno);
			ps1.setInt(3, VNo);
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
