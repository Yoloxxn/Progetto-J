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
public class TermostatoDistributore extends TermostatoGenerico {

    private double tmax;
    private double tmin;
    private double t;

    public TermostatoDistributore() {
        super(null);
        tmax = 0;
        tmin = 0;
        t = 0;
    }

    public double getTmax() {
        return tmax;
    }

    public double getTmin() {
        return tmin;
    }

    public double getT() {
        return t;
    }

    public void changeTFromTMax() {
        t = tmax;
    }

    public void changeTFromTMin() {
        t = tmin;
    }

    @Override
    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    @Override
    public void setTmin(double tmin) {
        this.tmin = tmin;
    }

    public void resetTermostato() {
        tmax = 0;
        tmin = 0;
        t = 0;
    }

}
