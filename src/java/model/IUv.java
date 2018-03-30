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
public interface IUv {
    public void addUv(Uv u);
    public List<Uv> listUv();
    public List<Uv> uvParMc(String mc);
    public Uv getUv(String nUv);
    public void updateUv(Uv u);
    public void deleteUv(String nUv);
    
}
