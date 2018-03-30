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
import model.IUv;
import model.Uv;
import model.UvImpl;

/**
 *
 * @author malickbassoum
 */
@WebServlet(name = "UvServlet", urlPatterns = {"/UvServlet"})
public class UvServlet extends HttpServlet {
    private IUv uve;
    
    @Override
    public void init() throws ServletException{
        uve=new UvImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         UvModel model=new UvModel();
         request.setAttribute("model", model);
        String action=request.getParameter("action");
        if(action!=null){
            if(action.equals("Chercher")){
               
                model.setMotCle(request.getParameter("motCle"));
                List<Uv> uvs=uve.uvParMc(model.getMotCle());
                model.setUvs(uvs);
                
            }
            else if(action.equals("edit")){
                String nom=request.getParameter("nom");
                Uv u=uve.getUv(nom);
                model.setUv(u);
                model.setMode("edit");
                model.setUvs(uve.listUv());
            }
            else if(action.equals("delete")){
                String nom=request.getParameter("nom");
                uve.deleteUv(nom);
                model.setUvs(uve.listUv());
            }
             else if(action.equals("Ajouter")){
                model.getUv().setnUv(request.getParameter("nUv"));
                model.getUv().setNomUv(request.getParameter("nomUv"));
               
                model.setMode(request.getParameter("mode"));
                if(model.getMode().equals("ajout"))
                    uve.addUv(model.getUv());
                else if(model.getMode().equals("edit"))
                    uve.updateUv(model.getUv());
                model.setUvs(uve.listUv());
            }
        }
        
      
        request.getRequestDispatcher("vueUv.jsp").forward(request, response);
    }
}
