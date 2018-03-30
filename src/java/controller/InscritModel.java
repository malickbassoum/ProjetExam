/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Inscrit;

/**
 *
 * @author malickbassoum
 */
public class InscritModel {
    private String motCle;
    private String mode="ajout";
    private Inscrit inscrit=new Inscrit();
    private List<Inscrit> inscrits=new ArrayList<Inscrit>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<Inscrit> getInscrits() {
        return inscrits;
    }

    public void setIncrits(List<Inscrit> inscrits) {
        this.inscrits = inscrits;
    }

    public Inscrit getInscrit() {
        return inscrit;
    }

    public void setInscrit(Inscrit inscrit) {
        this.inscrit = inscrit;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    
    
}
