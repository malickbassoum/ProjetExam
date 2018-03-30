/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author malickbassoum
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
           String _username=request.getParameter("username");
           String _password=request.getParameter("password");
           
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/bdexamen";
                String user="root",mdp="";
               try {
                   Connection conn=DriverManager.getConnection(url, user, mdp);
                   //String req="select login,passwd from utilisateur where login='" +_username+"' and passwd='"+_password+"'";
                   Statement stm=conn.createStatement();
                   ResultSet req=stm.executeQuery("select login,passwd from utilisateur where login='" +_username+"' and passwd='"+_password+"'");
                    if(req.next()){
                        HttpSession session=request.getSession();
                        session.setAttribute("username", _username);
                         response.sendRedirect("welcome.jsp");
                     }
                     else{
                     out.println("Connexion echoué|Reessayer");
                 }
                 
                   
               } catch (SQLException ex) {
                   Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
               }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
           
             try {
                
                    
             } catch (Exception e) {
                 out.println("Error:" +e.getMessage());
             }
             
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

   

}
