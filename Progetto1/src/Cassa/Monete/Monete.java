/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cassa.Monete;

/**
 *
 * @author MZ
 */
public class Monete {

    private TipoMonete tipo;
    private int numerotipo;

    public Monete(TipoMonete tipo) {
        this.tipo = tipo;
    }

    public TipoMonete getTipo() {
        return tipo;
    }

    public int getNumerotipo() {
        return numerotipo;
    }

    public void resetMonete() {
        numerotipo = 0;
    }

    public void addMonete() {
        numerotipo++;
    }
    
    public void subMonete(){
        numerotipo--;
    }

    public String stampaMoneta() {
        String s = "";
        s = s + String.format("%-20s %-10s", getTipo(), getNumerotipo());
        return s;
    }

}

class testMonete {

    public static void main(String[] args) {

        Monete x = new Monete(TipoMonete.C10);

        System.out.println(x.stampaMoneta());

        x.addMonete();
        x.addMonete();
        x.addMonete();
        System.out.println(x.stampaMoneta());
        x.resetMonete();
        System.out.println(x.stampaMoneta());
    }
}
