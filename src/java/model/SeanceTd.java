/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author malickbassoum
 */
public class SeanceTd {
    private String nUv,nTd,nEnseignant,salle,horaire;

    public String getnUv() {
        return nUv;
    }

    public void setnUv(String nUv) {
        this.nUv = nUv;
    }

    public String getnTd() {
        return nTd;
    }

    public void setnTd(String nTd) {
        this.nTd = nTd;
    }

    public String getnEnseignant() {
        return nEnseignant;
    }

    public void setnEnseignant(String nEnseignant) {
        this.nEnseignant = nEnseignant;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public SeanceTd() {
    }

    public SeanceTd(String nUv, String nTd, String nEnseignant, String salle, String horaire) {
        this.nUv = nUv;
        this.nTd = nTd;
        this.nEnseignant = nEnseignant;
        this.salle = salle;
        this.horaire = horaire;
    }
    
    
    
}
