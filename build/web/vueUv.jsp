<%-- 
    Document   : vueUv
    Created on : 28 mars 2018, 18:51:06
    Author     : malickbassoum
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enseignant</title>
        <link href="bootstrap.css" type="text/css"  rel="stylesheet">
        <script type="text/javascript"> 
            function confirmer(url){
                var rep= confirm("Etes vous sur de vouloir supprimer?");
                if(rep==true){
                    document.location=url;
                }
            }
        </script>
    </head>
    <body>
        <div style="padding-left: 15px; padding-top: 15px;padding-bottom: 10px">
        <a class="btn btn-info" href="http://localhost:8080/Examen/home.jsp">Home</a>
        <a class="btn btn-danger" href="http://localhost:8080/Examen/logout.jsp">Logout</a>
        </div>
        <div class="container" style="padding-left: 350px">
        <form action="/Examen/UvServlet" method="post">
            <table>
                <tr>
                  <td>Mot clé</td>
                  <td><input type="text" name="motCle" value="${model.motCle}"></td>
                  <td ><input class="btn btn-success" type="submit" value="Chercher" name="action"></td>
                </tr>
            </table>
        </form>
        </div> 
                  <div class="container" style=" padding-left: 350px">
        <form action="/Examen/UvServlet" method="post">
            <input type="hidden" value="${model.mode}" name="mode">
            <table>
                <tr>
                  <td>N Uv: </td>
                  <td><input type="text" name="nUv" value="${model.uv.nUv}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Nom Uv:</td>
                  <td><input type="text" name="nomUv" value="${model.uv.nomUv}"></td>
                  <td></td>
                 </tr>
                <tr>
                    <td><input class="btn btn-info" type="submit" name="action" value="Ajouter"></td>
                </tr>
            </table>
        </form>
        </div>          
                  <div class="container" style="padding-left: 350px">
            <table  class="table" style="width: 500px">
                <thead>
                    <tr class="danger">
                    <th>NUV</th>
                    <th>Nom UV</th>
                    
                </tr>
                </thead>
                <c:forEach items="${model.uvs}" var="u">
                    <tbody>
                        <tr class="info">
                        <td>${u.nUv}</td>
                        <td>${u.nomUv}</td>
                        
                        <td><a href="javascript:confirmer('/Examen/UvServlet?action=delete&nom=${u.nUv}')" class="btn btn-danger">Suprimer</a></td>
                        <td><a href="/Examen/UvServlet?action=edit&nom=${u.nUv}" class="btn btn-info">Editer</a></td>
                    </tr>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
