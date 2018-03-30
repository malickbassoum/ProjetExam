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
public class EtudiantImpl implements IEtudiant{

    @Override
    public void addEtudiant(Etudiant et) {
        Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("insert into etudiant values(?,?,?,?,?)");
            ps.setString(1, et.getnEtudiant());
            ps.setString(2, et.getNomEtudiant());
            ps.setString(3, et.getPrenomEtudiant());
            ps.setString(4, et.getAdressetudiant());
            ps.setString(5, et.getIdUser());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Etudiant> listEtudiant() {
        List<Etudiant> etu=new ArrayList<Etudiant>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from etudiant");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Etudiant et=new Etudiant();
                et.setnEtudiant(rs.getString("netudiant"));
                et.setNomEtudiant(rs.getString("nometudiant"));
                et.setPrenomEtudiant(rs.getString("prenometudiant"));
                et.setAdressetudiant(rs.getString("adressetudiant"));
                et.setIdUser(rs.getString("idUser"));
                etu.add(et);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return etu;
        
    }

    @Override
    public List<Etudiant> etudiantparMc(String mc) {
           List<Etudiant> etu=new ArrayList<Etudiant>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from etudiant where nometudiant like ? ");
            ps.setString(1, "%"+mc+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Etudiant et=new Etudiant();
                et.setnEtudiant(rs.getString("netudiant"));
                et.setNomEtudiant(rs.getString("nometudiant"));
                et.setPrenomEtudiant(rs.getString("prenometudiant"));
                et.setAdressetudiant(rs.getString("adressetudiant"));
                et.setIdUser(rs.getString("idUser"));
                etu.add(et);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return etu;
    }

    @Override
    public Etudiant getEtudiant(String idUser) {
        Etudiant et=null;
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from etudiant where idUser=? ");
            ps.setString(1, idUser);
            ResultSet rs=ps.executeQuery();
           
              if(rs.next()){
                  et=new Etudiant();
                et.setnEtudiant(rs.getString("netudiant"));
                et.setNomEtudiant(rs.getString("nometudiant"));
                et.setPrenomEtudiant(rs.getString("prenometudiant"));
                et.setAdressetudiant(rs.getString("adressetudiant"));
                et.setIdUser(rs.getString("idUser"));   
              }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        if(et==null) throw new RuntimeException("Etudiant"+ idUser+" introuvable");
        return et;
    }

    @Override
    public void updateEtudiant(Etudiant et) {
            Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("update etudiant set netudiant=?,nometudiant=?,prenometudiant=?,grade=? where idUser=?");
            
            ps.setString(1, et.getnEtudiant());
            ps.setString(2, et.getNomEtudiant());
            ps.setString(3, et.getPrenomEtudiant());
            ps.setString(4, et.getAdressetudiant());
            ps.setString(5, et.getIdUser());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void deleteEtudiant(String idUser) {
        Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("delete from etudiant where idUser=?");
            ps.setString(1, idUser);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    }
  


