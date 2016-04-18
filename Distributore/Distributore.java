/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distributore;

import Cassa.CassaDistributore;
import Data.DatoDistributore;
import Prodotto.Paletta;
import Prodotto.Prodotto;
import Prodotto.Zucchero;
import Termostato.TermostatoDistributore;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author MZ
 */
public class Distributore extends DistributoreGenerico {

    private CassaDistributore cassa;
    private DatoDistributore data;
    private TermostatoDistributore termostato;
    private Zucchero sugar;
    private Paletta spoon;

    private ArrayList<Prodotto> elencoprodotto;
    private ArrayList<String> statistica;

    public Distributore(String id) {
        super(id);
        elencoprodotto = new ArrayList<Prodotto>();
        sugar = new Zucchero("Zucchero");
        spoon = new Paletta("Paletta");
        data = new DatoDistributore();
        cassa = new CassaDistributore("00-10pv", "Steel");
    }

    public ArrayList<Prodotto> getElencoprodotto() {
        return elencoprodotto;
    }

    public void addProdotto(Prodotto item) {
        elencoprodotto.add(item);
    }

    public void clearELenco() {
        elencoprodotto.clear();
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
        s = s + "Elenco prodotti distributore : " + "\n"
                + "-----------------------------------------------------" + "\n";
        for (Prodotto x : elencoprodotto) {
            s = s + x.stampaProdotto() + "\n";
        }
        s = s + "-----------------------------------------------------" + "\n";
        return s;
    }

    public void erogaProdotto(String nome) {
        for (Prodotto x : elencoprodotto) {
            if (x.getCodiceprodotto().equals(nome)) {
                if (x.getQuantita() > 0) {
                    x.togliXquantita(1);
                }
            }
        }
    }

    public void refillDistributoreProdotto() {
        for (Prodotto x : elencoprodotto) {
            x.refillQuantita();
        }
    }

    public String stampaZucchero() {
        String s = "";
        s = s + sugar.getQuantita();
        return s;
    }

    public void erogaZucchero() {
        if (sugar.getQuantita() > 0) {
            sugar.togliXquantita(1);
        }
    }

    public void refillDistributoreZucchero() {
        sugar.refillQuantita();
    }

    public String stampaPaletta() {
        String s = "";
        s = s + spoon.getQuantita();
        return s;
    }

    public void erogaPaletta() {
        if (spoon.getQuantita() > 0) {
            spoon.togliXquantita(1);
        }
    }

    public void refillDistributorePaletta() {
        spoon.refillQuantita();
    }

    public String stampaData() {
        String s = "";
        s = s + data.stampaDato();
        return s;
    }

    public String stampaDistributoreCassa() {
        String s = "";
        s = s + cassa.stampaCassa();
        return s;
    }

    public void resetDistributoreCassa() {
        cassa.resetMonete();
    }

    public void inserisciMoneteDistributore(int campo1, int campo2, int campo3, int campo4, int campo5, int campo6) {
        cassa.calcolaContanteInserito(campo1, campo2, campo3, campo4, campo5, campo6);
    }

    public void calcolaDistributoreResto(double valore) {
        cassa.calcolaResiduo(valore);
    }

    public void DistributoreResto() {
        cassa.calcolaResto();
    }

    @Override
    public String stampaDistributore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class testDistributore {

    public static void main(String[] args) throws IOException {

        Distributore x = new Distributore("0001");

//        x.leggiProdotto("src/INPUT/CatalogoProdottoBevandeCalde.txt");
//        
//        System.out.println(x.stampaElencoProdotti());
//        
//        x.erogaProdotto("cioccolata");
//        System.out.println(x.stampaElencoProdotti());
//        
//        x.refillDistributoreProdotto();
//        System.out.println(x.stampaElencoProdotti());
//
//        System.out.println(x.stampaZucchero());
//        x.erogaZucchero();
//        System.out.println(x.stampaZucchero());
//        x.refillDistributoreZucchero();
//        System.out.println(x.stampaZucchero());
//
//          System.out.println(x.stampaPaletta());
//          x.erogaPaletta();
//          System.out.println(x.stampaPaletta());
//          x.refillDistributorePaletta();
//          System.out.println(x.stampaPaletta());
//
////        System.out.println(x.stampaData());
//
        System.out.println(x.stampaDistributoreCassa());

        x.inserisciMoneteDistributore(4, 5, 1, 2, 30, 2);
        x.calcolaDistributoreResto(5.20);
        System.out.println(x.stampaDistributoreCassa());
        x.DistributoreResto();
        System.out.println(x.stampaDistributoreCassa());

    }

}
