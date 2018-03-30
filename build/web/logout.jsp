<%-- 
    Document   : logout
    Created on : 22 mars 2018, 15:08:07
    Author     : malickbassoum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            <%
		session.invalidate();
		response.sendRedirect("home.jsp");
	%>
           
    </body>
</html>
