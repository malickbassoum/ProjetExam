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
public class SeanceTdImpl implements ISeanceTd{

    @Override
    public void addSeanceTd(SeanceTd se) {
       Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("insert into seancetd values(?,?,?,?,?)");
            ps.setString(1, se.getnUv());
            ps.setString(2, se.getnTd());
            ps.setString(3, se.getnEnseignant());
            ps.setString(4, se.getSalle());
            ps.setString(5, se.getHoraire());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(SeanceTdImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<SeanceTd> listSeanceTd() {
         List<SeanceTd> sea=new ArrayList<SeanceTd>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from seancetd");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                SeanceTd se=new SeanceTd();
                se.setnUv(rs.getString("nuv"));
                se.setnTd(rs.getString("ntd"));
                se.setnEnseignant(rs.getString("nenseignant"));
                se.setSalle(rs.getString("salle"));
                se.setHoraire(rs.getString("horaire"));
                sea.add(se);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SeanceTdImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return sea;
    }

    @Override
    public List<SeanceTd> seanceTdParMc(String mc) {
        List<SeanceTd> sea=new ArrayList<SeanceTd>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from seancetd where nuv like ? ");
            ps.setString(1, "%"+mc+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                SeanceTd se=new SeanceTd();
                se.setnUv(rs.getString("nuv"));
                se.setnTd(rs.getString("ntd"));
                se.setnEnseignant(rs.getString("nenseignant"));
                se.setSalle(rs.getString("salle"));
                se.setHoraire(rs.getString("horaire"));
                sea.add(se);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SeanceTdImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return sea;
        
    }

    @Override
    public SeanceTd getSeanceTd(String nUv) {
        SeanceTd se=null;
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from seancetd where nuv=? ");
            ps.setString(1, nUv);
            ResultSet rs=ps.executeQuery();
           
              if(rs.next()){
                  se=new SeanceTd();
                se.setnUv(rs.getString("nuv"));
                se.setnTd(rs.getString("ntd"));
                se.setnEnseignant(rs.getString("nenseignant"));
                se.setSalle(rs.getString("salle"));
                se.setHoraire(rs.getString("horaire"));   
              }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SeanceTdImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        if(se==null) throw new RuntimeException("Seance de Td"+ nUv + " introuvable");
        return se;
        
    }

    @Override
    public void updateSeanceTd(SeanceTd se) {
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("update seancetd set ntd=?,nenseignant=?,salle=?,horaire=? where nuv=?");
            
            ps.setString(1, se.getnTd());
            ps.setString(2, se.getnEnseignant());
            ps.setString(3, se.getSalle());
            ps.setString(4, se.getHoraire());
            ps.setString(5, se.getnUv());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(SeanceTdImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteSeanceTd(String nUv) {
       Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("delete from seancetd where nuv=?");
            ps.setString(1, nUv);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(SeanceTdImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
