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
public interface ComportamentoProdottoDistributore {

    /**
     *
     * @param valore
     * @return 
     */
    public boolean togliXquantita(int valore);

    /**
     *
     * @return 
     */
    public boolean refillQuantita();

}
