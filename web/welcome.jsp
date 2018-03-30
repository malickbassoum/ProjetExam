<%-- 
    Document   : welcome.jsp
    Created on : 22 mars 2018, 12:58:52
    Author     : malickbassoum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interface utilisateur</title>
        <link href="bootstrap.css" type="text/css"  rel="stylesheet">
    </head>
    <body>
        
       <h1>Bienvenue dans votre page d'accueil</h1>
       <div style="padding-left: 25px">
       <a class="btn btn-info" href="http://localhost:8080/Examen/home.jsp">Home</a>
       <a class="btn btn-success" href="http://localhost:8080/Examen/login.jsp">Login</a>
       <a class="btn btn-danger" href="http://localhost:8080/Examen/logout.jsp">Logout</a>
        </div>
        <br><br>
        <div class="container" style="padding-left: 350px">
             <a class="btn btn-primary" href="http://localhost:8080/Examen/vueEnseignant.jsp">Enseignants</a>
              <a class="btn btn-primary" href="http://localhost:8080/Examen/vueEtudiant.jsp">Etudiants</a>
               <a class="btn btn-primary" href="#">Uv</a>
                <a class="btn btn-primary" href="http://localhost:8080/Examen/vueSeanceTd.jsp">Seances TD</a>
                 <a class="btn btn-primary" href="http://localhost:8080/Examen/vueInscrit.jsp">Inscrits</a>
        </div>
        
    </body>
</html>
