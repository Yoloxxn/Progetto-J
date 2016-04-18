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
public class Prodotto extends ProdottoGenerico {

    private final int capacita = 100;
    private int quantita;
    private double prezzo;

    /**
     *
     * @param codiceprodotto
     */
    public Prodotto(String codiceprodotto,double prezzo) {
        super(codiceprodotto);
        this.prezzo=prezzo;
        quantita=capacita;
    }

    /**
     *
     * @return
     */
    public int getQuantita() {
        return quantita;
    }  

    public double getPrezzo() {
        return prezzo;
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
    
    public String stampaProdotto(){
        String s="";
        s=s+String.format("%-30s %-10s %-10s", getCodiceprodotto(),getPrezzo(),getQuantita());
        return s;
    }


}


class testProdotto{
    public static void main(String[] args) {
        
        Prodotto x= new Prodotto("Sapone",2.0D);
        
        System.out.println(x.getQuantita());
        
        System.out.println(x.stampaProdotto());
        
    }
}
