/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author malickbassoum
 */
public interface IEtudiant {
    
     public void addEtudiant(Etudiant et);
    public List<Etudiant> listEtudiant();
    public List<Etudiant> etudiantparMc(String mc);
    public Etudiant getEtudiant(String idUser);
    public void updateEtudiant(Etudiant et);
    public void deleteEtudiant(String idUser);
    
}
