/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Termostato;

/**
 *
 * @author MZ
 */
public class TermostatoDistributore extends TermostatoGenerico{
    
    private double tmax;
    private double tmin;

    public TermostatoDistributore() {
        super(null);
    }

    public double getTmax() {
        return tmax;
    }

    public double getTmin() {
        return tmin;
    }

    @Override
    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    @Override
    public void setTmin(double tmin) {
        this.tmin = tmin;
    }

    

    
    
    
}
