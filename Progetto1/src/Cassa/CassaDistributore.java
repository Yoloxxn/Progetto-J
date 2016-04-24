/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cassa;

import statistica.Controller.CassaController;



/**
 *
 * @author MZ
 */
public class CassaDistributore extends CassaGenerica {

    private String idcassa;
    private int nquantita;   

    private CassaController CC;

    public CassaDistributore(String produttore) {
        super(produttore);
        CC = new CassaController();
        nquantita = 0;

    }

    public String getIdcassa() {
        return idcassa;
    }

    public int getNquantita() {
        return nquantita;
    }

    public void resetCassa() {
        CC.reset();
        nquantita = 0;
    }

    public void aggiungiSoldiCassa(int campo1, int campo2, int campo3, int campo4, int campo5, int campo6) {
        CC.calcolaContante(campo1, campo2, campo3, campo4, campo5, campo6);
    }

    public void calcolaResto(double prezzo) {
        CC.calcolaResto(prezzo);
    }

}

class testCassa {

    public static void main(String[] args) {

        CassaDistributore x = new CassaDistributore("Steel");

        

        x.aggiungiSoldiCassa(3, 0, 3, 0, 1, 0);

       

    }
}
