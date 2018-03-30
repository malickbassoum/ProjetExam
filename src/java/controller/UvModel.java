/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Uv;

/**
 *
 * @author malickbassoum
 */
public class UvModel {
    private String motCle;
    private String mode="ajout";
    private Uv uv=new Uv();
    private List<Uv> uvs=new ArrayList<>();

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

    public Uv getUv() {
        return uv;
    }

    public void setUv(Uv uv) {
        this.uv = uv;
    }

    public List<Uv> getUvs() {
        return uvs;
    }

    public void setUvs(List<Uv> uvs) {
        this.uvs = uvs;
    }
    
    
}
