/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author malickbassoum
 */
public class InscritImpl implements IInscrit{

    @Override
    public void addInscrit(Inscrit in) {
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("insert into inscrit values(?,?,?,?)");
            ps.setString(1, in.getnUv());
            ps.setString(2, in.getnEtudiant());
            ps.setString(3, in.getDateIns());
            ps.setString(4, in.getnTd());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Inscrit> listInscrit() {
        List<Inscrit> ins=new ArrayList<Inscrit>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from inscrit");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Inscrit in=new Inscrit();
                in.setnUv(rs.getString("nuv"));
                in.setnEtudiant(rs.getString("netudiant"));
                in.setDateIns(rs.getString("dateins"));
                in.setnTd(rs.getString("ntd"));
                
                ins.add(in);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ins;
        
    }

    @Override
    public List<Inscrit> inscritParMc(String mc) {
        List<Inscrit> ins=new ArrayList<Inscrit>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from inscrit where nuv like ? ");
            ps.setString(1, "%"+mc+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Inscrit in=new Inscrit();
                in.setnEtudiant(rs.getString("netudiant"));
                in.setnUv(rs.getString("nuv"));
                in.setDateIns(rs.getString("dateins"));
                in.setnTd(rs.getString("ntd"));
               
                ins.add(in);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ins;
    }

    @Override
    public Inscrit getInscrit(String nUv) {
       Inscrit in=null;
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from inscrit where nuv=? ");
            ps.setString(1, nUv);
            ResultSet rs=ps.executeQuery();
           
              if(rs.next()){
                  in=new Inscrit();
                in.setnUv(rs.getString("nuv"));
                in.setnEtudiant(rs.getString("netudiant"));
                in.setDateIns(rs.getString("dateins"));
                in.setnTd(rs.getString("ntd"));
                   
              }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        if(in==null) throw new RuntimeException("Inscrit"+ nUv +" introuvable");
        return in;
    }

    @Override
    public void updateInscrit(Inscrit in) {
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("update inscrit set netudiant=?,dateins=?,ntd=? where nuv=?");
            
            ps.setString(1, in.getnEtudiant());
            ps.setString(2, in.getDateIns());
            ps.setString(3, in.getnTd());
            ps.setString(4, in.getnUv());
            
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteInscrit(String nUv) {
       Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("delete from inscrit where nuv=?");
            ps.setString(1, nUv);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
