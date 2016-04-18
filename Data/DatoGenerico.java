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
public abstract  class DatoGenerico implements ComportamentoDato{
    
    
 
    private Data data;

    public DatoGenerico() {
     
        data=new Data();
    }
    

    public String  getData() {
        return data.stampaData();
    }


    
    
    
}
