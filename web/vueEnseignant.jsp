<%-- 
    Document   : vueEnseignant
    Created on : 23 mars 2018, 12:05:48
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
        <form action="/Examen/EnseignantServlet" method="post">
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
        <form action="/Examen/EnseignantServlet" method="post">
            <input type="hidden" value="${model.mode}" name="mode">
            <table>
                <tr>
                  <td>N Enseignant: </td>
                  <td><input type="text" name="nEnseignant" value="${model.enseignant.nEnseignant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Nom:</td>
                  <td><input type="text" name="nomEnseignant" value="${model.enseignant.nomEnseignant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Prenom:</td>
                  <td><input type="text" name="prenomEnseignant" value="${model.enseignant.prenomEnseignant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Grade:</td>
                  <td><input type="text" name="grade" value="${model.enseignant.grade}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Id User:</td>
                  <td><input type="text" name="idEnseignant" value="${model.enseignant.idEnseignant}"></td>
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
                    <th>NEnseignant</th>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Grade</th>
                    <th>Id user</th>
                </tr>
                </thead>
                <c:forEach items="${model.enseignants}" var="en">
                    <tbody>
                        <tr class="info">
                        <td>${en.nEnseignant}</td>
                        <td>${en.nomEnseignant}</td>
                        <td>${en.prenomEnseignant}</td>
                        <td>${en.grade}</td>
                        <td>${en.idEnseignant}</td>
                        <td><a href="javascript:confirmer('/Examen/EnseignantServlet?action=delete&nom=${en.idEnseignant}')" class="btn btn-danger">Suprimer</a></td>
                        <td><a href="/Examen/EnseignantServlet?action=edit&nom=${en.idEnseignant}" class="btn btn-info">Editer</a></td>
                    </tr>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
