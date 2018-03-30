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
public class Enseignant implements Serializable{
    
    private String nEnseignant;
    private String nomEnseignant;
    private String prenomEnseignant;
    private String grade;
    private String idEnseignant;

    public String getnEnseignant() {
        return nEnseignant;
    }

    public void setnEnseignant(String nEnseignant) {
        this.nEnseignant = nEnseignant;
    }

    public String getNomEnseignant() {
        return nomEnseignant;
    }

    public void setNomEnseignant(String nomEnseignant) {
        this.nomEnseignant = nomEnseignant;
    }

    public String getPrenomEnseignant() {
        return prenomEnseignant;
    }

    public void setPrenomEnseignant(String prenomEnseignant) {
        this.prenomEnseignant = prenomEnseignant;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(String idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public Enseignant() {
    }

    public Enseignant(String nEnseignant, String nomEnseignant, String prenomEnseignant, String grade, String idEnseignant) {
        this.nEnseignant = nEnseignant;
        this.nomEnseignant = nomEnseignant;
        this.prenomEnseignant = prenomEnseignant;
        this.grade = grade;
        this.idEnseignant = idEnseignant;
    }
 
    
}
