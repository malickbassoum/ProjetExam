<%-- 
    Document   : vueInscrit
    Created on : 27 mars 2018, 14:22:42
    Author     : malickbassoum
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscrit</title>
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
        <form action="/Examen/InscritServlet" method="post">
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
        <form action="/Examen/InscritServlet" method="post">
            <input type="hidden" value="${model.mode}" name="mode">
            <table>
                <tr>
                  <td>N Uv: </td>
                  <td><input type="text" name="nUv" value="${model.inscrit.nUv}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>N Etudiant:</td>
                  <td><input type="text" name="nEtudiant" value="${model.inscrit.nEtudiant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Date Inscrit:</td>
                  <td><input type="text" name="dateIns" value="${model.inscrit.dateIns}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>TD:</td>
                  <td><input type="text" name="nTd" value="${model.inscrit.nTd}"></td>
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
                    <th>N uv</th>
                    <th>N Etudiant</th>
                    <th>Date Ins</th>
                    <th>N TD</th>
                    
                </tr>
                </thead>
                <c:forEach items="${model.inscrits}" var="in">
                    <tbody>
                        <tr class="info">
                        <td>${in.nUv}</td>
                        <td>${in.nEtudiant}</td>
                        <td>${in.dateIns}</td>
                        <td>${in.nTd}</td>
                       
                        <td><a href="javascript:confirmer('/Examen/InscritServlet?action=delete&nom=${in.nUv}')" class="btn btn-danger">Suprimer</a></td>
                        <td><a href="/Examen/InscritServlet?action=edit&nom=${in.nUv}" class="btn btn-info">Editer</a></td>
                    </tr>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
