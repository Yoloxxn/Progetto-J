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
public class DataDistributore extends DataGenerica{

    public DataDistributore() {
        super();
       
    }


    @Override
    public String calcolaData() {
        String s="";
        s=s+String.format(" %-20s",getData());
        return s;
    }
    
    @Override
    public String stampaDato() {
        String s="";
        s=s+calcolaData()+"\n";
        return s;
    }


    
}


class TestDatoDistributore{
    public static void main(String[] args) {
        
        DataDistributore x = new DataDistributore();
        
        System.out.println(x.stampaDato());
        
        System.out.println(x.calcolaMese());
        
        
    }
}