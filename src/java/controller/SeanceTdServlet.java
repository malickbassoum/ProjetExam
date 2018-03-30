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
import model.ISeanceTd;
import model.SeanceTd;
import model.SeanceTdImpl;

/**
 *
 * @author malickbassoum
 */
@WebServlet(name = "SeanceTdServlet", urlPatterns = {"/SeanceTdServlet"})
public class SeanceTdServlet extends HttpServlet {
     private ISeanceTd sean;
    
    @Override
    public void init() throws ServletException{
        sean=new SeanceTdImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         SeanceTdModel model=new SeanceTdModel();
         request.setAttribute("model", model);
        String action=request.getParameter("action");
        if(action!=null){
            if(action.equals("Chercher")){
               
                model.setMotCle(request.getParameter("motCle"));
                List<SeanceTd> seanceTds=sean.seanceTdParMc(model.getMotCle());
                model.setSeanceTds(seanceTds);
                
            }
            else if(action.equals("edit")){
                String nom=request.getParameter("nom");
                SeanceTd se=sean.getSeanceTd(nom);
                model.setSeanceTd(se);
                model.setMode("edit");
                model.setSeanceTds(sean.listSeanceTd());
            }
            else if(action.equals("delete")){
                String nom=request.getParameter("nom");
                sean.deleteSeanceTd(nom);
                model.setSeanceTds(sean.listSeanceTd());
            }
             else if(action.equals("Ajouter")){
                model.getSeanceTd().setnUv(request.getParameter("nUv"));
                model.getSeanceTd().setnTd(request.getParameter("nTd"));
                model.getSeanceTd().setnEnseignant(request.getParameter("nEnseignant"));
                model.getSeanceTd().setSalle(request.getParameter("salle"));
                model.getSeanceTd().setHoraire(request.getParameter("horaire"));
                model.setMode(request.getParameter("mode"));
                if(model.getMode().equals("ajout"))
                    sean.addSeanceTd(model.getSeanceTd());
                else if(model.getMode().equals("edit"))
                    sean.updateSeanceTd(model.getSeanceTd());
                model.setSeanceTds(sean.listSeanceTd());
            }
        }
        
      
        request.getRequestDispatcher("vueSeanceTd.jsp").forward(request, response);
    }
    
    
    

}
