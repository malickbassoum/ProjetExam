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
public class UvImpl implements IUv{

    @Override
    public void addUv(Uv u) {
        Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("insert into uv values(?,?)");
            ps.setString(1, u.getnUv());
            ps.setString(2, u.getNomUv());
           
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UvImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Uv> listUv() {
         List<Uv> uvs=new ArrayList<Uv>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from uv");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Uv u=new Uv();
                u.setnUv(rs.getString("nUv"));
                u.setNomUv(rs.getString("nomUv"));
               
                uvs.add(u);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UvImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return uvs;
        
    }

    @Override
    public List<Uv> uvParMc(String mc) {
       List<Uv> uvs=new ArrayList<Uv>();
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from uv where nuv like ? ");
            ps.setString(1, "%"+mc+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Uv u=new Uv();
                u.setnUv(rs.getString("nUv"));
                u.setNomUv(rs.getString("nomUv"));
                
               
                uvs.add(u);
            }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UvImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return uvs;
    }

    @Override
    public Uv getUv(String nUv) {
         Uv u=null;
         Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from uv where nuv=? ");
            ps.setString(1, nUv);
            ResultSet rs=ps.executeQuery();
           
              if(rs.next()){
                  u=new Uv();
                u.setnUv(rs.getString("nUv"));
                u.setNomUv(rs.getString("nomUv"));
                
                   
              }
           ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UvImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        if(u==null) throw new RuntimeException("Nom"+ nUv +" introuvable");
        return u;
    }

    @Override
    public void updateUv(Uv u) {
        Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("update uv set nomuv=?where nuv=?");
            
            ps.setString(1, u.getNomUv());
            ps.setString(2, u.getnUv());
           
            
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UvImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteUv(String nUv) {
        Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("delete from uv where nuv=?");
            ps.setString(1, nUv);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UvImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
