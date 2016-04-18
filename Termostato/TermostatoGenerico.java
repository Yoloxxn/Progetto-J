/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Termostato;

/**
 *
 * @author MZ
 */
public abstract class TermostatoGenerico implements ComportamentoTermostato{
    
    private String codice;

    public TermostatoGenerico(String codice) {
        this.codice = codice;
    }



    public String getCodice() {
        return codice;
    }


    
    
    
    
}
