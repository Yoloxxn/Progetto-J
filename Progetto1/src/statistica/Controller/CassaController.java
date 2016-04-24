/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistica.Controller;

import Cassa.Monete.Monete;
import Cassa.Monete.TipoMonete;

import java.util.ArrayList;

/**
 *
 * @author MZ
 */
public class CassaController {

    protected ArrayList<Monete> monete;

    private final int dim = 100;

    private int nmonete;

    private double totcassa;
    private double resto;
    private double contanteinserito;

    public CassaController() {
        monete = new ArrayList<Monete>();
        monete.add(new Monete(TipoMonete.C5));
        monete.add(new Monete(TipoMonete.C10));
        monete.add(new Monete(TipoMonete.C20));
        monete.add(new Monete(TipoMonete.C50));
        monete.add(new Monete(TipoMonete.E1));
        monete.add(new Monete(TipoMonete.E2));
        nmonete = 0;
        totcassa = 0D;
        resto = 0D;
        contanteinserito = 0D;
    }

    public String stampaMonete() {
        String s = "";
        for (Monete x : monete) {
            s = s + x.stampaMoneta() + "\n";
        }
        return s;
    }

    public Monete getMoneta(TipoMonete tipo) {
        for (Monete x : monete) {
            if (tipo == x.getTipo()) {
                return x;
            }
        }
        return null;
    }

    public int getNmonete() {
        return nmonete;
    }

    public double getContanteinserito() {
        return contanteinserito;
    }

    public double getResto() {
        return resto;
    }

    public double getTotcassa() {
        return totcassa;
    }

    public int getDim() {
        return dim;
    }

    public void aggiungiMoneta(TipoMonete tipo) {
        for (Monete x : monete) {
            if (tipo == x.getTipo()) {
                x.addMonete();
                nmonete++;
            }
        }
    }

    public void sottraiMoneta(TipoMonete tipo) {
        for (Monete x : monete) {
            if (tipo == x.getTipo()) {
                x.subMonete();
                nmonete--;
            }
        }
    }

    public void reset() {
        for (Monete x : monete) {
            x.resetMonete();
            nmonete = 0;
        }
        nmonete = 0;
        totcassa = 0D;
        resto = 0D;
        contanteinserito = 0D;

    }
    
    public double controlloContante(int campo1, int campo2, int campo3, int campo4, int campo5, int campo6) {
        double cont=0D;
        cont=(campo1*0.05)+(campo2*0.010)+(campo3*0.20)+(campo4*0.50)+(campo5*1.00)+(campo6*2.00);
        return cont;
    }

    public double calcolaContante(int campo1, int campo2, int campo3, int campo4, int campo5, int campo6) {
        double tot = 0D;
        int moneteinserite = campo1 + campo2 + campo3 + campo4 + campo5 + campo6;
        if (nmonete + moneteinserite <= dim) {
            while (campo1 > 0) {
                aggiungiMoneta(TipoMonete.C5);
                tot = tot + 0.05D;
                campo1--;
            }
            while (campo2 > 0) {
                aggiungiMoneta(TipoMonete.C10);
                tot = tot + 0.10D;
                campo2--;
            }
            while (campo3 > 0) {
                aggiungiMoneta(TipoMonete.C20);
                tot = tot + 0.20D;
                campo3--;
            }
            while (campo4 > 0) {
                aggiungiMoneta(TipoMonete.C50);
                tot = tot + 0.50D;
                campo4--;
            }
            while (campo5 > 0) {
                aggiungiMoneta(TipoMonete.E1);
                tot = tot + 1.00D;
                campo5--;
            }
            while (campo6 > 0) {
                aggiungiMoneta(TipoMonete.E2);
                tot = tot + 2.00D;
                campo6--;
            }

        }
        contanteinserito = tot;
        totcassa = totcassa + tot;
        return tot;
    }

    public double calcolaResto(double prezzo) {
        resto = resto + (contanteinserito - prezzo);
        return resto;
    }

    private void calcolaResto2Euro() {
        int n = 0;
        int k = (int) ((getResto()) / (2));
        double j = (getResto()) % (2);

        while (getMoneta(TipoMonete.E2).getNumerotipo() > 0 & k > 0) {
            totcassa = totcassa - 2;
            k--;
            getMoneta(TipoMonete.E2).subMonete();
            nmonete--;
            n++;
        }
        resto = Math.abs(2 * ((int) ((getResto()) / (2)) - n) + j);
    }

    private void calcolaResto1Euro() {
        int n = 0;
        int k = (int) ((getResto()) / (1));
        double j = (getResto()) % (1);

        while (getMoneta(TipoMonete.E1).getNumerotipo() > 0 & k > 0) {
            totcassa = totcassa - 1;
            k--;
            getMoneta(TipoMonete.E1).subMonete();
            nmonete--;
            n++;
        }
        resto = Math.abs(1 * ((int) ((getResto()) / (1)) - n) + j);
    }

    private void calcolaResto50Cent() {
        int n = 0;
        int k = (int) ((getResto()) / (0.50));
        double j = (getResto()) % (0.50);

        while (getMoneta(TipoMonete.C50).getNumerotipo() > 0 & k > 0) {
            totcassa = totcassa - 0.5;
            k--;
            getMoneta(TipoMonete.C50).subMonete();
            nmonete--;
            n++;
        }
        resto = Math.abs(0.50 * ((int) ((getResto()) / (0.50)) - n) + j);
    }

    private void calcolaResto20Cent() {
        int n = 0;
        int k = (int) ((getResto()) / (0.20));
        double j = (getResto()) % (0.20);

        while (getMoneta(TipoMonete.C20).getNumerotipo() > 0 & k > 0) {
            totcassa = totcassa - 0.20;
            k--;
            getMoneta(TipoMonete.C20).subMonete();
            nmonete--;
            n++;
        }
        resto = Math.abs(0.20 * ((int) ((getResto()) / (0.20)) - n) + j);
        resto = Math.ceil(resto) * 0.10;
    }

    private void calcolaResto10Cent() {
        int n = 0;
        int k = (int) ((getResto()) / (0.10));
        double j = (getResto()) % (0.10);

        while (getMoneta(TipoMonete.C10).getNumerotipo() > 0 & k > 0) {
            totcassa = totcassa - 0.10;
            k--;
            getMoneta(TipoMonete.C10).subMonete();
            nmonete--;
            n++;
        }
        resto = Math.abs(0.10 * ((int) ((getResto()) / (0.10)) - n) + j);
        //  residuo = Math.ceil(residuo) * 0.05;
    }

    private void calcolaResto5Cent() {
        int n = 0;
        int k = (int) ((getResto()) / (0.05));
        double j = (getResto()) % (0.05);

        while (getMoneta(TipoMonete.C5).getNumerotipo() > 0 & k > 0) {
            totcassa = totcassa - 0.05;
            k--;
            getMoneta(TipoMonete.C5).subMonete();
            nmonete--;
            n++;
        }
        resto = Math.abs(0.05 * ((int) ((getResto()) / (0.05)) - n) + j);
        //  residuo = Math.ceil(residuo) * 0.01;
    }

    public void distribuisciResto() {
        calcolaResto2Euro();
        calcolaResto1Euro();
        calcolaResto50Cent();
        calcolaResto20Cent();
        calcolaResto10Cent();
        calcolaResto5Cent();
    }

    public String stampaCassa() {
        String s = "";
        s = s + "**************************" + "\n";
        s = s + "Monete : " + "\n";
        for (Monete x : monete) {
            s = s + x.stampaMoneta() + "\n";
        }
        s = s + "\n";
        s = s + String.format("%-20s %-10s", "Contante inserito ", (double)(Math.round(contanteinserito*100))/100) + "\n";
        s = s + String.format("%-20s %-10s", "ToT cassa ", (double)(Math.round(totcassa*100))/100) + "\n";
        s = s + String.format("%-20s %-10s", "Numero monete ", nmonete) + "\n";
        s = s + "\n";
        s = s + "**************************" + "\n";
        return s;
    }

}

class testA {

    public static void main(String[] args) {

        CassaController x = new CassaController();

        System.out.println(x.stampaMonete());

        System.out.println(x.getMoneta(TipoMonete.E1).stampaMoneta());

        x.aggiungiMoneta(TipoMonete.E1);

        System.out.println(x.getMoneta(TipoMonete.E1).stampaMoneta());

        System.out.println(x.stampaMonete());

        x.reset();

        System.out.println(x.stampaMonete());

        System.out.println(x.calcolaContante(1, 0, 2, 0, 4, 0));
        System.out.println(x.stampaMonete());

        x.reset();

        System.out.println(x.stampaCassa());

        x.calcolaContante(2, 1, 1, 0, 0, 1);
        System.out.println(x.stampaCassa());

        System.out.println(x.calcolaResto(0.40));
        x.distribuisciResto();
        System.out.println(x.stampaCassa());

    }
}
