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
public class EnseignantImpl implements IEnseignant{

    @Override
    public void addEnseignant(Enseignant en) {
        Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("insert into enseignant values(?,?,?,?,?)");
            ps.setString(1, en.getnEnseignant());
            ps.setString(2, en.getNomEnseignant());
            ps.setString(3, en.getPrenomEnseignant());
            ps.setString(4, en.getGrade());
            ps.setString(5, en.getIdEnseignant());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Enseignant> listEnseignant() {
        List<Enseignant> ens=new ArrayList<Enseignant>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from enseignant");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Enseignant en=new Enseignant();
                en.setnEnseignant(rs.getString("nenseignant"));
                en.setNomEnseignant(rs.getString("nomenseignant"));
                en.setPrenomEnseignant(rs.getString("prenomenseignant"));
                en.setGrade(rs.getString("grade"));
                en.setIdEnseignant(rs.getString("idEnseignant"));
                ens.add(en);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ens;
    }

    @Override
    public List<Enseignant> enseignantparMc(String mc) {
         List<Enseignant> ens=new ArrayList<Enseignant>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from enseignant where nomenseignant like ? ");
            ps.setString(1, "%"+mc+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Enseignant en=new Enseignant();
                en.setnEnseignant(rs.getString("nenseignant"));
                en.setNomEnseignant(rs.getString("nomenseignant"));
                en.setPrenomEnseignant(rs.getString("prenomenseignant"));
                en.setGrade(rs.getString("grade"));
                en.setIdEnseignant(rs.getString("idEnseignant"));
                ens.add(en);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ens;
    }

    @Override
    public Enseignant getEnseignant(String idEnseignant) {
         Enseignant en=null;
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from enseignant where idEnseignant=? ");
            ps.setString(1, idEnseignant);
            ResultSet rs=ps.executeQuery();
           
              if(rs.next()){
                  en=new Enseignant();
                en.setnEnseignant(rs.getString("nenseignant"));
                en.setNomEnseignant(rs.getString("nomenseignant"));
                en.setPrenomEnseignant(rs.getString("prenomenseignant"));
                en.setGrade(rs.getString("grade"));
                en.setIdEnseignant(rs.getString("idEnseignant"));   
              }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        if(en==null) throw new RuntimeException("Enseignant"+ idEnseignant+" introuvable");
        return en;
    }

    @Override
    public void updateEnseignant(Enseignant en) {
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("update enseignant set nenseignant=?,nomenseignant=?,prenomenseignant=?,grade=? where idEnseignant=?");
            
            ps.setString(1, en.getnEnseignant());
            ps.setString(2, en.getNomEnseignant());
            ps.setString(3, en.getPrenomEnseignant());
            ps.setString(4, en.getGrade());
            ps.setString(5, en.getIdEnseignant());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteEnseignant(String idEnseignant) {
        Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("delete from enseignant where idEnseignant=?");
            ps.setString(1, idEnseignant);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EnseignantImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
