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
public class Inscrit implements Serializable{
    private String nUv;
    private String nEtudiant;
    private String dateIns;
    private String nTd;

   

    public String getnUv() {
        return nUv;
    }

    public void setnUv(String nUv) {
        this.nUv = nUv;
    }

    public String getnEtudiant() {
        return nEtudiant;
    }

    public void setnEtudiant(String nEtudiant) {
        this.nEtudiant = nEtudiant;
    }

    public String getDateIns() {
        return dateIns;
    }

    public void setDateIns(String dateIns) {
        this.dateIns = dateIns;
    }

    public String getnTd() {
        return nTd;
    }

    public void setnTd(String nTd) {
        this.nTd = nTd;
    }

    public Inscrit() {
    }

    public Inscrit(String nUv, String nEtudiant, String dateIns, String nTd) {
        this.nUv = nUv;
        this.nEtudiant = nEtudiant;
        this.dateIns = dateIns;
        this.nTd = nTd;
    }
    
    
    
}
