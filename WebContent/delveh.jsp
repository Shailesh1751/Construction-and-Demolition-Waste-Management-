<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
  
    <%@page import ="java.sql.*" %>
    <%@page import ="com.cnd.admin.*" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
  String id = (request.getParameter("id"));
	//String 	Vehicle_No=request.getParameter("Vehicle_No");
	Connection con = ConnectDB.Connect();
	
	 try
     {
     	PreparedStatement ps2= con.prepareStatement("delete from addvehicle where ID=?");
     	ps2.setString(1, id);
     	int rs2 = ps2.executeUpdate();
     	if(rs2>0)
     	{
				response.sendRedirect("viewall.jsp");

     	}
     	else{
     		response.sendRedirect("404.html");
     	}
     
     } 
     catch(Exception e)
     {
     	System.out.println(e);
    	// e.printStackTrace();
     }


%>



</body>
</html>