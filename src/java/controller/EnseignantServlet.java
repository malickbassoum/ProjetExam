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
import model.Enseignant;
import model.EnseignantImpl;
import model.IEnseignant;

/**
 *
 * @author malickbassoum
 */
@WebServlet(name = "EnseignantServlet", urlPatterns = {"/EnseignantServlet"})
public class EnseignantServlet extends HttpServlet {
    private IEnseignant ense;
    
    @Override
    public void init() throws ServletException{
        ense=new EnseignantImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         EnseignantModel model=new EnseignantModel();
         request.setAttribute("model", model);
        String action=request.getParameter("action");
        if(action!=null){
            if(action.equals("Chercher")){
               
                model.setMotCle(request.getParameter("motCle"));
                List<Enseignant> enseignants=ense.enseignantparMc(model.getMotCle());
                model.setEnseignants(enseignants);
                
            }
            else if(action.equals("edit")){
                String nom=request.getParameter("nom");
                Enseignant en=ense.getEnseignant(nom);
                model.setEnseignant(en);
                model.setMode("edit");
                model.setEnseignants(ense.listEnseignant());
            }
            else if(action.equals("delete")){
                String nom=request.getParameter("nom");
                ense.deleteEnseignant(nom);
                model.setEnseignants(ense.listEnseignant());
            }
             else if(action.equals("Ajouter")){
                model.getEnseignant().setnEnseignant(request.getParameter("nEnseignant"));
                model.getEnseignant().setNomEnseignant(request.getParameter("nomEnseignant"));
                model.getEnseignant().setPrenomEnseignant(request.getParameter("prenomEnseignant"));
                model.getEnseignant().setGrade(request.getParameter("grade"));
                model.getEnseignant().setIdEnseignant(request.getParameter("idEnseignant"));
                model.setMode(request.getParameter("mode"));
                if(model.getMode().equals("ajout"))
                    ense.addEnseignant(model.getEnseignant());
                else if(model.getMode().equals("edit"))
                    ense.updateEnseignant(model.getEnseignant());
                model.setEnseignants(ense.listEnseignant());
            }
        }
        
      
        request.getRequestDispatcher("vueEnseignant.jsp").forward(request, response);
    }
    
    
    

}
