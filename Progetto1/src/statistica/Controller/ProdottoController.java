/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistica.Controller;

import Prodotto.Prodotto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author MZ
 */
public class ProdottoController {

    private ArrayList<Prodotto> elencoprodotti;

    public ProdottoController() {
        elencoprodotti = new ArrayList<Prodotto>();
    }

    public ArrayList<Prodotto> getElencoprodotti() {
        return elencoprodotti;
    }

    public void addProdotto(Prodotto item) {
        elencoprodotti.add(item);
    }

    public void clearELenco() {
        elencoprodotti.clear();
    }

    public void leggiProdotto(String nomefile) throws IOException {
        String s = "";
        FileReader fr = new FileReader(nomefile);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String line = br.readLine();
            String[] part = line.split("\t");
            Prodotto p = new Prodotto(part[0], Double.parseDouble(part[1]));
            addProdotto(p);
        }
    }

    public String stampaElencoProdotti() {
        String s = "";
        s = s + "Elenco prodotti : " + "\n"
                + "-----------------------------------------------------" + "\n";
        for (Prodotto x : elencoprodotti) {
            s = s + x.stampaProdotto() + "\n";
        }
        s = s + "-----------------------------------------------------" + "\n";
        return s;
    }

    public boolean controllaQuantitaProdotto(String nomeprodotto) {
        for (Prodotto x : elencoprodotti) {
            if (x.getCodiceprodotto().equals(nomeprodotto)) {
                if (x.getQuantita() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean distribuisciProdotto(String nomeprodotto) {
        for (Prodotto x : elencoprodotti) {
            if (x.getCodiceprodotto().equals(nomeprodotto)) {
                if (x.getQuantita() > 0) {
                    x.togliXquantita(1);
                    return true;
                }
            }
        }
        return false;
    }

    public void refillDistributoreProdotto() {
        for (Prodotto x : elencoprodotti) {
            x.refillQuantita();
        }
    }

    public double getPrezzoProdotto(String nomeprodotto) {
        for (Prodotto x : elencoprodotti) {
            if (x.getCodiceprodotto().equals(nomeprodotto)) {
                return x.getPrezzo();
            }
        }
        return 0;
    }
}

class testPr {

    public static void main(String[] args) throws IOException {

        ProdottoController x = new ProdottoController();

        x.leggiProdotto("src/INPUT/CatalogoProdottoBevandeCalde.txt");

        System.out.println(x.stampaElencoProdotti());

        x.distribuisciProdotto("cioccolata");
        x.distribuisciProdotto("cioccolata");
        x.distribuisciProdotto("cioccolata");

        System.out.println(x.stampaElencoProdotti());

        x.refillDistributoreProdotto();
        System.out.println(x.stampaElencoProdotti());

        System.out.println(x.getPrezzoProdotto("cioccolata"));

    }
}
