/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistica.Controller;

import Prodotto.Zucchero;

/**
 *
 * @author MZ
 */
public class ZuccheroController {

    protected Zucchero zucchero;

    public ZuccheroController() {
        zucchero = new Zucchero("Bianco");
    }

    public Zucchero getZucchero() {
        return zucchero;
    }

    public int getQuantitaZucchero() {
        return zucchero.getQuantita();
    }

    public void distribuisciZucchero() {
        zucchero.togliXquantita(1);
    }

    public void refillZucchero() {
        zucchero.refillQuantita();
    }

    public boolean controllaQuantitaZucchero() {
        if (getQuantitaZucchero() > 0) {
            return true;
        }
        return false;
    }

    public String stampaZucchero() {
        String s = "";
        s = s + "**************************" + "\n";
        s = s + "Zucchero : " + "\n";
        s = s + "\n";
        s = s + String.format("%-20s %-10s", "Quantita' : ", zucchero.getQuantita()) + "\n";
        s = s + "\n";
        s = s + "**************************" + "\n";
        return s;
    }

}

class TestZ {

    public static void main(String[] args) {

        ZuccheroController x = new ZuccheroController();

        System.out.println(x.stampaZucchero());

        x.distribuisciZucchero();
        x.distribuisciZucchero();

        System.out.println(x.stampaZucchero());

        x.refillZucchero();
        System.out.println(x.stampaZucchero());

    }
}
