/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;



/**
 *
 * @author malickbassoum
 */
public class Uv implements Serializable{
    private String nUv,nomUv;

    public Uv() {
    }

    public Uv(String nUv, String nomUv) {
        this.nUv = nUv;
        this.nomUv = nomUv;
    }

    public String getnUv() {
        return nUv;
    }

    public void setnUv(String nUv) {
        this.nUv = nUv;
    }

    public String getNomUv() {
        return nomUv;
    }

    public void setNomUv(String nomUv) {
        this.nomUv = nomUv;
    }
    
   
    
    
}
