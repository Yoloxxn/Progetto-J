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
public abstract class ProdottoGenerico implements ComportamentoProdottoDistributore {

    private String codiceprodotto;

    /**
     *
     * @param codiceprodotto
     */
    public ProdottoGenerico(String codiceprodotto) {
        this.codiceprodotto = codiceprodotto;
    }

    /**
     *
     * @return
     */
    public String getCodiceprodotto() {
        return codiceprodotto;
    }



}
