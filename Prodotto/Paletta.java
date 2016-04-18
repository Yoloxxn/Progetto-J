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
public class Paletta extends ProdottoGenerico {

    private final int capacita = 100;
    private int quantita;

    public Paletta(String codice) {
        super( codice);
        quantita=capacita;
    }
    
    /**
     *
     * @return
     */
    public int getQuantita() {
        return quantita;
    }    
    
    @Override
    public void togliXquantita(int valore) {
        if (quantita > 0 & quantita >= valore) {
            quantita = quantita - valore;
        }
    }

    @Override
    public void refillQuantita() {
        quantita = capacita;
    }

}


class testPaletta{
    public static void main(String[] args) {
        
        Paletta x = new Paletta("Paletta");
        
        System.out.println(x.getQuantita());
        System.out.println(x.getCodiceprodotto());
        
    }
}
