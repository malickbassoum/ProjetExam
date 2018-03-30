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
public interface ISeanceTd {
    
    public void addSeanceTd(SeanceTd se);
    public List<SeanceTd> listSeanceTd();
    public List<SeanceTd> seanceTdParMc(String mc);
    public SeanceTd getSeanceTd(String nUv);
    public void updateSeanceTd(SeanceTd se);
    public void deleteSeanceTd(String nUv);
    
}
