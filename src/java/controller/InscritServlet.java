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
import model.IInscrit;
import model.InscritImpl;
import model.Inscrit;

/**
 *
 * @author malickbassoum
 */
@WebServlet(name = "InscritServlet", urlPatterns = {"/InscritServlet"})
public class InscritServlet extends HttpServlet {
    
    private IInscrit insc;
    
    @Override
    public void init() throws ServletException{
        insc=new InscritImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         InscritModel model=new InscritModel();
         request.setAttribute("model", model);
        String action=request.getParameter("action");
        if(action!=null){
            if(action.equals("Chercher")){
               
                model.setMotCle(request.getParameter("motCle"));
                List<Inscrit> inscrits=insc.inscritParMc(model.getMotCle());
                model.setIncrits(inscrits);
                
            }
            else if(action.equals("edit")){
                String nom=request.getParameter("nom");
                Inscrit in=insc.getInscrit(nom);
                model.setInscrit(in);
                model.setMode("edit");
                model.setIncrits(insc.listInscrit());
            }
            else if(action.equals("delete")){
                String nom=request.getParameter("nom");
                insc.deleteInscrit(nom);
                model.setIncrits(insc.listInscrit());
            }
             else if(action.equals("Ajouter")){
                model.getInscrit().setnUv(request.getParameter("nUv"));
                model.getInscrit().setnEtudiant(request.getParameter("nEtudiant"));
                model.getInscrit().setDateIns(request.getParameter("dateIns"));
                model.getInscrit().setnTd(request.getParameter("nTd"));
                
                model.setMode(request.getParameter("mode"));
                if(model.getMode().equals("ajout"))
                    insc.addInscrit(model.getInscrit());
                else if(model.getMode().equals("edit"))
                    insc.updateInscrit(model.getInscrit());
                model.setIncrits(insc.listInscrit());
            }
        }
        
      
        request.getRequestDispatcher("vueInscrit.jsp").forward(request, response);
    }


}
