/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistica.Controller;

import Prodotto.Paletta;

/**
 *
 * @author MZ
 */
public class PalettaController {

    protected Paletta paletta;

    public PalettaController() {
        paletta = new Paletta("Plastaica");
    }

    public Paletta getPaletta() {
        return paletta;
    }

    public int getQuantitaPaletta() {
        return paletta.getQuantita();
    }

    public void distribuisciPaletta() {
        paletta.togliXquantita(1);
    }

    public void refillPaletta() {
        paletta.refillQuantita();
    }

    public boolean controllaQuantitapaletta() {
        if (getQuantitaPaletta()> 0) {
            return true;
        }
        return false;
    }

    public String stampaPaletta() {
        String s = "";
        s = s + "**************************" + "\n";
        s = s + "Paletta : " + "\n";
        s = s + "\n";
        s = s + String.format("%-20s %-10s", "Quantita' : ", paletta.getQuantita()) + "\n";
        s = s + "\n";
        s = s + "**************************" + "\n";
        return s;
    }

}

class testP {

    public static void main(String[] args) {

        PalettaController x = new PalettaController();

        System.out.println(x.stampaPaletta());

        x.distribuisciPaletta();
        x.distribuisciPaletta();

        System.out.println(x.stampaPaletta());

        x.refillPaletta();
        System.out.println(x.stampaPaletta());
    }
}
