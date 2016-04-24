/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distributore;

import java.io.IOException;
import statistica.Controller.StatisticaController;

/**
 *
 * @author MZ
 */
public class Distributore extends DistributoreGenerico {

    private StatisticaController statisticaC;

    public Distributore(String id) {
        super(id);
        statisticaC = new StatisticaController();
    }

    public StatisticaController getStatisticaC() {
        return statisticaC;
    }

    public void setTMin(double valore) {
        statisticaC.setTMin(valore);
    }

    public void setTMax(double valore) {
        statisticaC.setTMax(valore);
    }

    public void resetT() {
        statisticaC.resetT();
    }

    public void cambiaTFunzioneData() {
        statisticaC.cambiaTFunzioneData();
    }

    public void refillZucchero() {
        statisticaC.refillZucchero();
    }

    public void refillPaletta() {
        statisticaC.refillPaletta();
    }

    @Override
    public String stampaDistributore() {
        return statisticaC.stampaStatistica();
    }

    public void caricaProdotti(String nomefile) throws IOException {
        statisticaC.leggiProdotto(nomefile);
    }

    public void resetProdotti() {
        statisticaC.clearELenco();
    }

    public void ErogaProdotto(String nomeprodotto, int campo1, int campo2, int campo3, int campo4, int campo5, int campo6, int dosezucchero) {
        statisticaC.controllaSoldiErogaProdotto(nomeprodotto, campo1, campo2, campo3, campo4, campo5, campo6, dosezucchero);
    }

    public void resetDistributore() {
        statisticaC.resetMacchina();
    }

}

class TestDistributore {

    public static void main(String[] args) throws IOException {

        Distributore x = new Distributore("Lavazza");

        x.caricaProdotti("src/INPUT/CatalogoProdottoBevandeCalde.txt");

        System.out.println(x.stampaDistributore());

        x.ErogaProdotto("cioccolata", 2, 1, 1, 0, 0, 1, 2);

        System.out.println(x.stampaDistributore());

        x.resetDistributore();
        System.out.println(x.stampaDistributore());

    }
}
