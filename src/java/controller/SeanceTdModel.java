/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.SeanceTd;

/**
 *
 * @author malickbassoum
 */
public class SeanceTdModel {
     private String motCle;
    private String mode="ajout";
    private SeanceTd seanceTd=new SeanceTd();
    private List<SeanceTd> seanceTds=new ArrayList<SeanceTd>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public SeanceTd getSeanceTd() {
        return seanceTd;
    }

    public void setSeanceTd(SeanceTd seanceTd) {
        this.seanceTd = seanceTd;
    }

    public List<SeanceTd> getSeanceTds() {
        return seanceTds;
    }

    public void setSeanceTds(List<SeanceTd> seanceTds) {
        this.seanceTds = seanceTds;
    }
    
    
}
