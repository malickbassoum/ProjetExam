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
public class Etudiant {
    
    private String nEtudiant;
    private String nomEtudiant;
    private String prenomEtudiant;
    private String adressetudiant;
    private String idUser;

    public String getnEtudiant() {
        return nEtudiant;
    }

    public void setnEtudiant(String nEtudiant) {
        this.nEtudiant = nEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public String getAdressetudiant() {
        return adressetudiant;
    }

    public void setAdressetudiant(String adressetudiant) {
        this.adressetudiant = adressetudiant;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Etudiant() {
    }

    public Etudiant(String nEtudiant, String nomEtudiant, String prenomEtudiant, String adressetudiant, String idUser) {
        this.nEtudiant = nEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.adressetudiant = adressetudiant;
        this.idUser = idUser;
    }
    
    
    
    
}
