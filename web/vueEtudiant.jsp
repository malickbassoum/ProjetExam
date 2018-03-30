<%-- 
    Document   : vueEtudiant
    Created on : 26 mars 2018, 13:48:08
    Author     : malickbassoum
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Etudiant</title>
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
        <form action="/Examen/EtudiantServlet" method="post">
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
        <form action="/Examen/EtudiantServlet" method="post">
            <input type="hidden" value="${model.mode}" name="mode">
            <table>
                <tr>
                  <td>N Etudiant: </td>
                  <td><input type="text" name="nEtudiant" value="${model.etudiant.nEtudiant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Nom:</td>
                  <td><input type="text" name="nomEtudiant" value="${model.etudiant.nomEtudiant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Prenom:</td>
                  <td><input type="text" name="prenomEtudiant" value="${model.etudiant.prenomEtudiant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Adresse:</td>
                  <td><input type="text" name="adressetudiant" value="${model.etudiant.adressetudiant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Id User:</td>
                  <td><input type="text" name="idUser" value="${model.etudiant.idUser}"></td>
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
                    <th>NEtudiant</th>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Adresse</th>
                    <th>Id user</th>
                </tr>
                </thead>
                <c:forEach items="${model.etudiants}" var="et">
                    <tbody>
                        <tr class="info">
                        <td>${et.nEtudiant}</td>
                        <td>${et.nomEtudiant}</td>
                        <td>${et.prenomEtudiant}</td>
                        <td>${et.adressetudiant}</td>
                        <td>${et.idUser}</td>
                        <td><a href="javascript:confirmer('/Examen/EtudiantServlet?action=delete&nom=${et.idUser}')" class="btn btn-danger">Suprimer</a></td>
                        <td><a href="/Examen/EtudiantServlet?action=edit&nom=${et.idUser}" class="btn btn-info">Editer</a></td>
                    </tr>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
