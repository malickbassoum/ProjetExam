<%-- 
    Document   : vueSeanceTd
    Created on : 28 mars 2018, 16:21:57
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
        <form action="/Examen/SeanceTdServlet" method="post">
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
        <form action="/Examen/SeanceTdServlet" method="post">
            <input type="hidden" value="${model.mode}" name="mode">
            <table>
                <tr>
                  <td>N Uv: </td>
                  <td><input type="text" name="nUv" value="${model.seanceTd.nUv}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>N TD:</td>
                  <td><input type="text" name="nTd" value="${model.seanceTd.nTd}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>N Enseignant:</td>
                  <td><input type="text" name="nEnseignant" value="${model.seanceTd.nEnseignant}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Salle:</td>
                  <td><input type="text" name="salle" value="${model.seanceTd.salle}"></td>
                  <td></td>
                </tr>
                 <tr>
                  <td>Horaire:</td>
                  <td><input type="text" name="horaire" value="${model.seanceTd.horaire}"></td>
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
                    <th>N Uv</th>
                    <th>N Td</th>
                    <th>N Enseignant</th>
                    <th>Salle</th>
                    <th>Horaire</th>
                </tr>
                </thead>
                <c:forEach items="${model.seanceTds}" var="se">
                    <tbody>
                        <tr class="info">
                        <td>${se.nUv}</td>
                        <td>${se.nTd}</td>
                        <td>${se.nEnseignant}</td>
                        <td>${se.salle}</td>
                        <td>${se.horaire}</td>
                        <td><a href="javascript:confirmer('/Examen/SeanceTdServlet?action=delete&nom=${se.nUv}')" class="btn btn-danger">Suprimer</a></td>
                        <td><a href="/Examen/SeanceTdServlet?action=edit&nom=${se.nUv}" class="btn btn-info">Editer</a></td>
                    </tr>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
