package com.cnd.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cnd.admin.ConnectDB;

/**
 * Servlet implementation class registration
 */
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registration() {
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
		
		String rname = request.getParameter("name");
		String rcontact = request.getParameter("contactno");
		String remail = request.getParameter("email");
		String rpass = request.getParameter("password");
		String rprofession = request.getParameter("profession");
		String radd = request.getParameter("address");
		
		try
		{
			Connection con=ConnectDB.Connect();
			PreparedStatement ps1 = con.prepareStatement("insert into userlogin values(?,?,?,?,?,?)");
			ps1.setString(1, rname);
			ps1.setString(2, rcontact);
			ps1.setString(3, remail);
			ps1.setString(4, rpass);
			ps1.setString(5, rprofession);
			ps1.setString(6, radd);
			
			int rs =ps1.executeUpdate();
			if(rs>0)
			{
				response.sendRedirect("userlogin.html");
			}
			else{
				response.sendRedirect("registerUser.html");
			}
			
			
		
	}catch(Exception e)
		{
		e.printStackTrace();
		
		}

	}
}
