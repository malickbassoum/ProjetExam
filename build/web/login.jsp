<%-- 
    Document   : login
    Created on : 22 mars 2018, 11:48:56
    Author     : malickbassoum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <link href="bootstrap.css" type="text/css"  rel="stylesheet">
    </head>
    <body>
        <br><br><br>
    <center><h1>Authentification</h1></center>
    
        <form action="LoginServlet" method="POST">
            
            <table align="center">
                <tr>
                    <th align="right">Username:</th>
                    <td><input type="text" name="username" placeholder="username"></td>
                </tr>
                <tr>
                    <th align="right">Password:</th>
                    <td><input type="password" name="password" placeholder="password"></td>
                </tr>
                <tr>
                    <td colspan="2" align="right"><input type="submit" value="Connection" class="btn btn-primary"</td>
                </tr>
            </table>
        </form>
    </body>
</html>
