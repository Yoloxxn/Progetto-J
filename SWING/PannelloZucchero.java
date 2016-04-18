/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MZ
 */
public class PannelloZucchero extends JPanel {

    private JPanel pannellozucchero,pannellostringazucchero, pannelloconsolezucchero;

    private JLabel stringazucchero,a1,a2;

    private JButton z0, z1, z2;

    public PannelloZucchero() {
        initComp();
    }

    private void initComp() {
        //init label Zucchero
        stringazucchero = new JLabel("Scegli  Zucchero");
        a1=new JLabel("");
        a2=new JLabel("");
        
        //init pannello stringa zucchero
        pannellostringazucchero=new JPanel();
        pannellostringazucchero.setLayout(new GridLayout(1, 3, 15, 15));
        pannellostringazucchero.add(a1);
        pannellostringazucchero.add(stringazucchero);
        pannellostringazucchero.add(a2);
        

        //init pulsanti zucchero
        z0 = new JButton("0");
        z1 = new JButton("1");
        z2 = new JButton("2");

        //init console pulsanti zucchero
        pannellozucchero = new JPanel();
        pannellozucchero.setLayout(new GridLayout(1, 3, 15, 15));
        pannellozucchero.add(z0);
        pannellozucchero.add(z1);
        pannellozucchero.add(z2);

        //init pannello zucchero
        pannelloconsolezucchero = new JPanel();
        pannelloconsolezucchero.setLayout(new GridLayout(2, 1, 15, 15));
        pannelloconsolezucchero.add(pannellostringazucchero);
        pannelloconsolezucchero.add(pannellozucchero);

        //mainframe
        //setTitle("Pannello zucchero");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);
        setLayout(new BorderLayout());
        setSize(350, 130);
        setLocation(250, 50);
        //
        add(pannelloconsolezucchero, BorderLayout.CENTER);

    }

}


class testPannelloZucchero{
    
    public static void main(String[] args) {
        
        
        PannelloZucchero x = new PannelloZucchero();
        
        x.setVisible(true);
        
    }
}
