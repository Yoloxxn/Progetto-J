/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistica.Controller;

import Data.DataDistributore;

/**
 *
 * @author MZ
 */
public class DataController {

    protected DataDistributore datadistributore;

    public DataController() {
        datadistributore = new DataDistributore();
    }

    public DataDistributore getDatadistributore() {
        return datadistributore;
    }

    public String calcolaData() {
        return datadistributore.calcolaData();
    }

    public int calcolaMese() {
        return datadistributore.calcolaMese();
    }

}

class testD{
    public static void main(String[] args) {
        
        DataController x = new DataController();
        
        System.out.println(x.calcolaMese());
        System.out.println(x.calcolaData());
        
        
    }
}
