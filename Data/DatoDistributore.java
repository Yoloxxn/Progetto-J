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
public class DatoDistributore extends DatoGenerico{

    public DatoDistributore() {
        super();
       
    }


    @Override
    public String calcolaDato() {
        String s="";
        s=s+String.format(" %-20s",getData());
        return s;
    }

    @Override
    public String stampaDato() {
        String s="";
        s=s+calcolaDato()+"\n";
        return s;
    }
    
}


class TestDatoDistributore{
    public static void main(String[] args) {
        
        DatoDistributore x = new DatoDistributore();
        
        System.out.println(x.stampaDato());
        
        
    }
}