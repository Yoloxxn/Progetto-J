/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distributore;

/**
 *
 * @author MZ
 */
public abstract class DistributoreGenerico {
    
    private String id;

    public DistributoreGenerico(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public abstract String stampaDistributore();
    
}
