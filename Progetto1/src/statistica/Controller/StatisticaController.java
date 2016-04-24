/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistica.Controller;

import java.io.IOException;

/**
 *
 * @author MZ
 */
public class StatisticaController {

    protected ZuccheroController zuccheroC;
    protected PalettaController palettaC;
    protected TermostatoController termostatoC;
    protected ProdottoController prodottoC;
    protected CassaController cassaC;
    protected DataController dataC;

    private double stamparesto;

    public StatisticaController() {
        zuccheroC = new ZuccheroController();
        palettaC = new PalettaController();
        termostatoC = new TermostatoController();
        prodottoC = new ProdottoController();
        cassaC = new CassaController();
        dataC = new DataController();

        stamparesto = 0;

    }

    public double getStamparesto() {
        return stamparesto;
    }

    public void cambiaTFunzioneData() {
        if (dataC.calcolaMese() < 4 | dataC.calcolaMese() > 9) {
            termostatoC.moveToTMax();
        }
        if (dataC.calcolaMese() > 3 | dataC.calcolaMese() < 10) {
            termostatoC.moveToTMin();
        }
    }

    public void setTMin(double valore) {
        termostatoC.setTMin(valore);
    }

    public void setTMax(double valore) {
        termostatoC.setTMax(valore);
    }

    public void resetT() {
        termostatoC.resetTermostato();
    }

    public void refillZucchero() {
        zuccheroC.refillZucchero();
    }

    public void refillPaletta() {
        palettaC.refillPaletta();
    }

    public void leggiProdotto(String nomefile) throws IOException {
        prodottoC.leggiProdotto(nomefile);
    }

    public void clearELenco() {
        prodottoC.clearELenco();
    }

    public void refillDistributoreProdotto() {
        prodottoC.refillDistributoreProdotto();
    }

    public void controllaSoldiErogaProdotto(String nomeprodotto, int campo1, int campo2, int campo3, int campo4, int campo5, int campo6, int dosezucchero) {
        if (cassaC.controlloContante(campo1, campo2, campo3, campo4, campo5, campo6) >= prodottoC.getPrezzoProdotto(nomeprodotto)) {
            if (prodottoC.controllaQuantitaProdotto(nomeprodotto)) {
                prodottoC.distribuisciProdotto(nomeprodotto);
                cassaC.calcolaContante(campo1, campo2, campo3, campo4, campo5, campo6);
                cassaC.calcolaResto(prodottoC.getPrezzoProdotto(nomeprodotto));
                cassaC.distribuisciResto();
                if (dosezucchero > 0 & zuccheroC.getQuantitaZucchero() > dosezucchero) {
                    if (dosezucchero>0 & palettaC.getQuantitaPaletta()>0) {
                        palettaC.distribuisciPaletta();
                    }
                    while (dosezucchero > 0) {
                        zuccheroC.distribuisciZucchero();
                        dosezucchero--;
                    }
                }
            }
        }
    }

    public String stampaStatistica() {
        String s = "";

        s = s + prodottoC.stampaElencoProdotti() + "\n";
        s = s + zuccheroC.stampaZucchero() + "\n";
        s = s + palettaC.stampaPaletta() + "\n";
        s = s + cassaC.stampaCassa() + "\n";
        s = s + String.format("%-20s %-10s", "Resto accumulato : ", getStamparesto()) + "\n";
        s = s + termostatoC.stampaTermostato() + "\n";

        return s;

    }

    public void resetMacchina() {
        zuccheroC.refillZucchero();
        palettaC.refillPaletta();
        termostatoC.resetTermostato();
        prodottoC.refillDistributoreProdotto();
        cassaC.reset();

        stamparesto = 0;

    }

}

class testS {

    public static void main(String[] args) throws IOException {

        StatisticaController x = new StatisticaController();

        x.leggiProdotto("src/INPUT/CatalogoProdottoBevandeCalde.txt");

        System.out.println(x.stampaStatistica());

        x.controllaSoldiErogaProdotto("cioccolata", 2, 1, 1, 0, 0, 1, 3);
        System.out.println(x.stampaStatistica());

    }
}
