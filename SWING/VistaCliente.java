/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author MZ
 */
public class VistaCliente extends JFrame implements ActionListener {

    private PannelloProdotti compProd;
    private PannelloCassa compCass;
    private PannelloZucchero compZucc;
    private PannelloIstruzioni compIstr;
    private PannelloConsole compCons;

    public VistaCliente() {
        initComp();
    }

    private void initComp() {
        //init componenti vista cliente
        compProd = new PannelloProdotti();
        compCass = new PannelloCassa();
        compZucc = new PannelloZucchero();
        compIstr = new PannelloIstruzioni();
        compCons = new PannelloConsole();

        //mainframe
        setTitle("Vista Cliente");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setSize(1300, 440);
        setLocation(50, 100);
        //
        setLayout(null);
        add(compProd);
        add(compCass);
        add(compZucc);
        add(compIstr);
        add(compCons);

        compProd.setBounds(0, 0, 600, 400);
        compCass.setBounds(615, 0, 350, 270);
        compZucc.setBounds(615, 270, 350, 130);
        compIstr.setBounds(980, 0, 300, 320);
        compCons.setBounds(980, 340, 300, 50);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class TestVistaCliente {

    public static void main(String[] args) {

        VistaCliente x = new VistaCliente();
        x.setVisible(true);

    }
}
