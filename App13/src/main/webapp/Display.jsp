<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>
	<%
		String name = (String) request.getParameter("uname");
		String msg1 = (String) application.getAttribute("msg1");
		String msg2 = (String) application.getInitParameter("msg2");
		
		String msg3 = (String) request.getAttribute("msg3"); //from servletConfig
		String msg4 = (String) request.getAttribute("msg4"); //from servletConfig
		
		out.println("Welcome "+name+" <br><br>");
		out.println("Context data : "+msg1+"(from Servlet) <br><br>");
		out.println("Server Name : "+application.getServerInfo()+" <br><br>");
		out.println("Context data "+msg2+"(from web.xml) <br><br>");

		out.println("Config data Servlet Name : "+msg3+"(from servlet) <br><br>");
		out.println("Config data : "+msg4+"(from web.xml) <br><br>");
	%>
</h1>
</body>
</html>