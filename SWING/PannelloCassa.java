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
import javax.swing.JTextField;
import static javax.swing.SwingConstants.RIGHT;

/**
 *
 * @author MZ
 */
public class PannelloCassa extends JPanel {

    private JButton contante, resto, eroga;

    private JLabel stringaitem, stringacontante, stringaresto;

    private JTextField itemselezionato, displaycontanteinserito, displayresto;

    private JPanel pannellopulsanticassa, pannellotextcassa, pannellocassa;

    public PannelloCassa() {
        initComp();
    }

    private void initComp() {
        //init label
        stringaitem = new JLabel("Prodotto selezionato");
        stringacontante = new JLabel("Contante inserito");
        stringaresto = new JLabel("Resto");

        //init textfiled cassa
        itemselezionato = new JTextField("Seleziona prodotto");
        displaycontanteinserito = new JTextField("0.0");
        displaycontanteinserito.setHorizontalAlignment(RIGHT);
        displayresto = new JTextField("0,0");
        displayresto.setHorizontalAlignment(RIGHT);

        //init pannello textcassa
        pannellotextcassa = new JPanel();
        pannellotextcassa.setLayout(new GridLayout(6, 1, 15, 15));
        pannellotextcassa.add(stringaitem);
        pannellotextcassa.add(itemselezionato);
        pannellotextcassa.add(stringacontante);
        pannellotextcassa.add(displaycontanteinserito);
        pannellotextcassa.add(stringaresto);
        pannellotextcassa.add(displayresto);

        //init pulsanti cassa
        contante = new JButton("INSERIRE");
        resto = new JButton("RESTO");
        eroga = new JButton("EROGA");

        //init pannello pulsanti cassa
        pannellopulsanticassa = new JPanel();
        pannellopulsanticassa.setLayout(new GridLayout(1, 3, 15, 15));
        pannellopulsanticassa.add(contante);
        pannellopulsanticassa.add(resto);
        pannellopulsanticassa.add(eroga);


        //mainframe cassa
        //setTitle("Pannello cassa");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);
        setLayout(new BorderLayout());
        setSize(350, 270);
        setLocation(250, 50);
        //
        add(pannellotextcassa, BorderLayout.NORTH);
        add(pannellopulsanticassa, BorderLayout.SOUTH);

    }

}

class testPannelloCassa {

    public static void main(String[] args) {

        PannelloCassa x = new PannelloCassa();
        x.setVisible(true);

    }
}
