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
public interface IEnseignant {
    
    public void addEnseignant(Enseignant en);
    public List<Enseignant> listEnseignant();
    public List<Enseignant> enseignantparMc(String mc);
    public Enseignant getEnseignant(String idEnseignant);
    public void updateEnseignant(Enseignant en);
    public void deleteEnseignant(String idEnseignant);
   
}
