/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Etudiant;
import model.EtudiantImpl;
import model.IEtudiant;

/**
 *
 * @author malickbassoum
 */
@WebServlet(name = "EtudiantServlet", urlPatterns = {"/EtudiantServlet"})
public class EtudiantServlet extends HttpServlet {

    private IEtudiant etud;
    
    @Override
    public void init() throws ServletException{
        etud=new EtudiantImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         EtudiantModel model=new EtudiantModel();
         request.setAttribute("model", model);
        String action=request.getParameter("action");
        if(action!=null){
            if(action.equals("Chercher")){
               
                model.setMotCle(request.getParameter("motCle"));
                List<Etudiant> etudiants=etud.etudiantparMc(model.getMotCle());
                model.setEtudiants(etudiants);
                
            }
            else if(action.equals("edit")){
                String nom=request.getParameter("nom");
                Etudiant et=etud.getEtudiant(nom);
                model.setEtudiant(et);
                model.setMode("edit");
                model.setEtudiants(etud.listEtudiant());
            }
            else if(action.equals("delete")){
                String nom=request.getParameter("nom");
                etud.deleteEtudiant(nom);
                model.setEtudiants(etud.listEtudiant());
            }
             else if(action.equals("Ajouter")){
                model.getEtudiant().setnEtudiant(request.getParameter("nEtudiant"));
                model.getEtudiant().setNomEtudiant(request.getParameter("nomEtudiant"));
                model.getEtudiant().setPrenomEtudiant(request.getParameter("prenomEtudiant"));
                model.getEtudiant().setAdressetudiant(request.getParameter("adressetudiant"));
                model.getEtudiant().setIdUser(request.getParameter("idUser"));
                model.setMode(request.getParameter("mode"));
                if(model.getMode().equals("ajout"))
                    etud.addEtudiant(model.getEtudiant());
                else if(model.getMode().equals("edit"))
                    etud.updateEtudiant(model.getEtudiant());
                model.setEtudiants(etud.listEtudiant());
            }
        }
        
      
        request.getRequestDispatcher("vueEtudiant.jsp").forward(request, response);
    }
    
}
