/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistica.Controller;

import Termostato.TermostatoDistributore;

/**
 *
 * @author MZ
 */
public class TermostatoController {

    protected TermostatoDistributore termostato;

    public TermostatoController() {
        termostato = new TermostatoDistributore();
    }

    public TermostatoDistributore getTermostato() {
        return termostato;
    }

    public double getTMin() {
        return termostato.getTmin();
    }

    public double getTMax() {
        return termostato.getTmax();
    }

    public double getT() {
        return termostato.getT();
    }

    public void setTMin(double valore) {
        termostato.setTmin(valore);
    }

    public void setTMax(double valore) {
        termostato.setTmax(valore);
    }

    public void moveToTMax() {
        termostato.changeTFromTMax();
    }

    public void moveToTMin() {
        termostato.changeTFromTMin();
    }
    
    public void resetTermostato(){
        termostato.resetTermostato();
    }

    public String stampaTermostato() {
        String s = "";
        s = s + "**************************" + "\n";
        s = s + "Termostato : " + "\n";
        s = s + "\n";
        s = s + String.format("%-20s %-10s", "TMax ", termostato.getTmax()) + "\n";
        s = s + String.format("%-20s %-10s", "TMin ", termostato.getTmin()) + "\n";
        s = s + String.format("%-20s %-10s", "T ", termostato.getT()) + "\n";
        s = s + "\n";
        s = s + "**************************" + "\n";
        return s;
    }

}




class testCT{
    public static void main(String[] args) {
         
        TermostatoController x = new TermostatoController();
        
        System.out.println(x.stampaTermostato());
        
    }

}
