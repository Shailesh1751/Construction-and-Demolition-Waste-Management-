package com.cnd.user;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cnd.admin.*;

/**
 * Servlet implementation class userLogin
 */
public class userLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userLogin() {
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
		
		
		String remail = request.getParameter("email");
		getset.setRemail(remail);
		String rpass = request.getParameter("password");
	
		try
		{
			Connection con=ConnectDB.Connect();
			PreparedStatement ps1 = con.prepareStatement("select * from userlogin where email=? and password=?");
			ps1.setString(1, remail);
			ps1.setString(2, rpass);
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("index.html");
			}else
			{
				response.sendRedirect("userLogin404.html");
			}
	}catch(Exception e)
		{
		e.printStackTrace();
		}

}
}

