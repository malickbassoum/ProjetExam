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
public interface IInscrit {
    public void addInscrit(Inscrit in);
    public List<Inscrit> listInscrit();
    public List<Inscrit> inscritParMc(String mc);
    public Inscrit getInscrit(String nUv);
    public void updateInscrit(Inscrit in);
    public void deleteInscrit(String nUv);
    
}
