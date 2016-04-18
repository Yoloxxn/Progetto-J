/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prodotto;

/**
 *
 * @author MZ
 */
public class Zucchero extends ProdottoGenerico {

    private final int capacita = 100;
    private int quantita;

    /**
     * Costruttore classe zucchero.
     * @param codice
     */
    public Zucchero(String codice) {
        super(codice);
        quantita=capacita;
    }

    /**
     * Restituisce valore quantita' zucchero.
     *
     * @return int quantita' zucchero presente.
     */
    public int getQuantita() {
        return quantita;
    }

    /**
     * Toglie un valore intero di zucchero alla quantita' zucchero se questa e'
     * positiva e maggiore o uguale alla quantita presente.
     *
     * @param valore Il valore di zucchero che si vuole togliere.
     */
    @Override
    public void togliXquantita(int valore) {
        if (quantita > 0 & quantita >= valore) {
            quantita = quantita - valore;
        }
    }

    /**
     * Aggiorna il valore della quantita di zucchero allo stato iniziale
     */
    @Override
    public void refillQuantita() {
        quantita = capacita;
    }



}

class testZucchero {

    public static void main(String[] args) {

        Zucchero x = new Zucchero("Zucchero");

        System.out.println(x.getQuantita());

        x.togliXquantita(2);
        System.out.println(x.getQuantita());

        x.refillQuantita();
        System.out.println(x.getQuantita());

    }
}
