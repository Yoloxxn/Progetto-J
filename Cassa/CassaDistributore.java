/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cassa;

/**
 *
 * @author MZ
 */
public class CassaDistributore extends CassaGenerica {

    private String idcassa;
    private final int dimcassa;
    private int nmonete;
    private int ncent5;
    private int ncent10;
    private int ncent20;
    private int ncent50;
    private int neuro1;
    private int neuro2;
    private double totcassa;
    private double contanteinserito;
    private double residuo;

    /**
     *
     * @param idcassa
     * @param produttore
     */
    public CassaDistributore(String idcassa, String produttore) {
        super(produttore);
        this.idcassa = idcassa;
        dimcassa = 100;
        nmonete = 0;
        ncent5 = 0;
        ncent10 = 0;
        ncent20 = 0;
        ncent50 = 0;
        neuro1 = 0;
        neuro2 = 0;
        totcassa = 000.0;
        contanteinserito = 000.0;
        residuo = 000.0;
    }

    /**
     *
     * @return
     */
    public String getIdcassa() {
        return idcassa;
    }

    /**
     *
     * @return
     */
    public int getDimcassa() {
        return dimcassa;
    }

    /**
     *
     * @return
     */
    public int getNmonete() {
        return nmonete;
    }

    /**
     *
     * @return
     */
    public int getNcent5() {
        return ncent5;
    }

    /**
     *
     * @return
     */
    public int getNcent10() {
        return ncent10;
    }

    /**
     *
     * @return
     */
    public int getNcent20() {
        return ncent20;
    }

    /**
     *
     * @return
     */
    public int getNcent50() {
        return ncent50;
    }

    /**
     *
     * @return
     */
    public int getNeuro1() {
        return neuro1;
    }

    /**
     *
     * @return
     */
    public int getNeuro2() {
        return neuro2;
    }

    /**
     *
     * @return
     */
    public double getTotcassa() {
        return totcassa;
    }

    /**
     *
     * @return
     */
    public double getContanteinserito() {
        return contanteinserito;
    }

    /**
     *
     * @return
     */
    public double getResiduo() {
        return residuo;
    }

    /**
     *
     */
    public void resetMonete() {
        ncent5 = 0;
        ncent10 = 0;
        ncent20 = 0;
        ncent50 = 0;
        neuro1 = 0;
        neuro2 = 0;
        totcassa = 0;
        contanteinserito = 0;
        residuo = 0;
        nmonete = 0;
    }

    @Override
    public void calcolaContanteInserito(int campo1, int campo2, int campo3, int campo4, int campo5, int campo6) {
        this.ncent5 = ncent5 + campo1;
        this.ncent10 = ncent10 + campo2;
        this.ncent20 = ncent20 + campo3;
        this.ncent50 = ncent50 + campo4;
        this.neuro1 = neuro1 + campo5;
        this.neuro2 = neuro2 + campo6;
        this.contanteinserito = (campo1 * 0.05) + (campo2 * 0.10) + (campo3 * 0.20) + (campo4 * 0.50) + (campo5 * 1) + (campo6 * 2);
        this.nmonete = nmonete + campo1 + campo2 + campo3 + campo4 + campo5 + campo6;
        this.totcassa = totcassa + (campo1 * 0.05) + (campo2 * 0.10) + (campo3 * 0.20) + (campo4 * 0.50) + (campo5 * 1) + (campo6 * 2);
    }

    /**
     *
     * @return
     */
    @Override
    public String stampaCassa() {
        String s = "";
        s = s + "***************************" + "\n";
        s = s + String.format("%-15s %10s", "5CENT : ", getNcent5()) + "\n";
        s = s + String.format("%-15s %10s", "10CENT : ", getNcent10()) + "\n";
        s = s + String.format("%-15s %10s", "20CENT : ", getNcent20()) + "\n";
        s = s + String.format("%-15s %10s", "50CENT : ", getNcent50()) + "\n";
        s = s + String.format("%-15s %10s", "1EURO : ", getNeuro1()) + "\n";
        s = s + String.format("%-15s %10s", "2EURO : ", getNeuro2()) + "\n";
        s = s + "***************************" + "\n";
        s = s + String.format("%-15s %10.5s", "Contante : ", getContanteinserito()) + "\n";
        s = s + String.format("%-15s %10s", "N monete : ", getNmonete()) + "\n";
        s = s + String.format("%-15s %10.5s", "ToT Cassa : ", getTotcassa()) + "\n";
        s = s + String.format("%-15s %10.5s", "Residuo : ", getResiduo()) + "\n";
        return s;
    }

    /**
     *
     * @param campo1
     */
    public void calcolaResiduo(double campo1) {
        residuo = residuo + (getContanteinserito() - campo1);
    }

    private void calcolaResto2Euro() {
        int n = 0;
        int k = (int) ((getResiduo()) / (2));
        double j = (getResiduo()) % (2);

        while (neuro2 > 0 & k > 0) {
            totcassa = totcassa - 2;
            k--;
            neuro2--;
            nmonete--;
            n++;
        }
        residuo = Math.abs(2 * ((int) ((getResiduo()) / (2)) - n) + j);
    }

    private void calcolaResto1Euro() {
        int n = 0;
        int k = (int) ((getResiduo()) / (1));
        double j = (getResiduo()) % (1);

        while (neuro1 > 0 & k > 0) {
            totcassa = totcassa - 1;
            k--;
            neuro1--;
            nmonete--;
            n++;
        }
        residuo = Math.abs(1 * ((int) ((getResiduo()) / (1)) - n) + j);
    }

    private void calcolaResto50Cent() {
        int n = 0;
        int k = (int) ((getResiduo()) / (0.5));
        double j = (getResiduo()) % (0.5);

        while (ncent50 > 0 & k > 0) {
            totcassa = totcassa - 0.5;
            k--;
            ncent50--;
            nmonete--;
            n++;
        }
        residuo = Math.abs(0.5 * ((int) ((getResiduo()) / (0.5)) - n) + j);
    }

    private void calcolaResto20Cent() {
        int n = 0;
        int k = (int) ((getResiduo()) / (0.20));
        double j = (getResiduo()) % (0.20);

        while (ncent20 > 0 & k > 0) {
            totcassa = totcassa - 0.20;
            k--;
            ncent20--;
            nmonete--;
            n++;
        }
        residuo = Math.abs(0.20 * ((int) ((getResiduo()) / (0.20)) - n) + j);
        residuo = Math.ceil(residuo) * 0.10;
    }

    private void calcolaResto10Cent() {
        int n = 0;
        int k = (int) ((getResiduo()) / (0.10));
        double j = (getResiduo()) % (0.10);

        while (ncent10 > 0 & k > 0) {
            totcassa = totcassa - 0.10;
            k--;
            ncent10--;
            nmonete--;
            n++;
        }
        residuo = Math.abs(0.10 * ((int) ((getResiduo()) / (0.10)) - n) + j);
        //  residuo = Math.ceil(residuo) * 0.05;
    }

    private void calcolaResto5Cent() {
        int n = 0;
        int k = (int) ((getResiduo()) / (0.05));
        double j = (getResiduo()) % (0.05);

        while (ncent5 > 0 & k > 0) {
            totcassa = totcassa - 0.05;
            k--;
            ncent5--;
            nmonete--;
            n++;
        }
        residuo = Math.abs(0.05 * ((int) ((getResiduo()) / (0.05)) - n) + j);
        //  residuo = Math.ceil(residuo) * 0.01;
    }

    /**
     *
     */
    public void calcolaResto() {
        calcolaResto2Euro();
        calcolaResto1Euro();
        calcolaResto50Cent();
        calcolaResto20Cent();
        calcolaResto10Cent();
        calcolaResto5Cent();
    }

}

class TestCassa {

    public static void main(String[] args) {

        CassaDistributore x = new CassaDistributore("00-10pv", "Steel");
        System.out.println(x.stampaCassa());

//inserisci monete 1
        x.calcolaContanteInserito(1, 0, 3, 0, 4, 0);
        System.out.println(x.stampaCassa());

//inserisci monete 2 e controlla residuo        
        x.calcolaContanteInserito(0, 0, 0, 0, 0, 3);
        x.calcolaResiduo(4.5);
        System.out.println(x.stampaCassa());

//        x.calcolaResto2Euro();
//        x.calcolaResto1Euro();
//        x.calcolaResto50Cent();
//        x.calcolaResto20Cent();
//        x.calcolaResto10Cent();
//        x.calcolaResto5Cent();
        x.calcolaResto();
        System.out.println(x.stampaCassa());

    }
}
