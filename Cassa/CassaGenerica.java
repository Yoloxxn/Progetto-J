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
public abstract class CassaGenerica implements ComportamentoCassa {

    private String produttore;

    /**
     *
     * @param produttore
     */
    public CassaGenerica(String produttore) {
        this.produttore = produttore;
    }

    /**
     *
     * @return
     */
    public String getProduttore() {
        return produttore;
    }

    /**
     *
     * @return
     */
    public abstract String stampaCassa();

}
