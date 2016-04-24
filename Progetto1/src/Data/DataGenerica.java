/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author MZ
 */
public abstract class DataGenerica implements ComportamentoData {

    private Data data;

    public DataGenerica() {

        data = new Data();
    }

    public String getData() {
        return data.stampaData();
    }

    public int calcolaMese() {
        return data.getMonth();
    }

}
