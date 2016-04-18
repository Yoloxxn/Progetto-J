/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MZ
 */
public class PannelloProdotti extends JPanel {

    private JButton p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13; //pulsanti

    private JLabel l0, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;  //stringhe

    private JLabel x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13;  //immagini

    private JPanel pannellobevande1, pannellobevande2, pannellobevandeE, pannellobevandeC, pannellobevandeW, pannellolabel1, pannellolabel2, pannellolabel3, pannellolabel4;

    public PannelloProdotti() {
        initComp();
    }

    private void initComp() {
        //init label 0-6
        l0 = new JLabel("caffé espresso");
        l1 = new JLabel("caffé lungo");
        l2 = new JLabel("caffé macchiato");
        l3 = new JLabel("cappuccino");
        l4 = new JLabel("tè alla menta");
        l5 = new JLabel("mocaccino");
        l6 = new JLabel("latte");

        //init label 7-13
        l7 = new JLabel("latte macchiato");
        l8 = new JLabel("cioccolata");
        l9 = new JLabel("cioccolata con latte");
        l10 = new JLabel("caffé decaffeinato");
        l11 = new JLabel("macchiato decaffeinato");
        l12 = new JLabel("cappuccino decaffeinato");
        l13 = new JLabel("tè al limone");

        //init pulsanti 0-6
        p0 = new JButton("");
        p1 = new JButton("");
        p2 = new JButton("");
        p3 = new JButton("");
        p4 = new JButton("");
        p5 = new JButton("");
        p6 = new JButton("");

        //init pulsanti 7-13
        p7 = new JButton("");
        p8 = new JButton("");
        p9 = new JButton("");
        p10 = new JButton("");
        p11 = new JButton("");
        p12 = new JButton("");
        p13 = new JButton("");

        //init pannello label1
        pannellolabel1 = new JPanel();
        pannellolabel1.setLayout(new GridLayout(7, 1, 15, 15));
        pannellolabel1.add(l0);
        pannellolabel1.add(l1);
        pannellolabel1.add(l2);
        pannellolabel1.add(l3);
        pannellolabel1.add(l4);
        pannellolabel1.add(l5);
        pannellolabel1.add(l6);

        //init pannello label2
        pannellolabel2 = new JPanel();
        pannellolabel2.setLayout(new GridLayout(7, 1, 15, 15));
        pannellolabel2.add(l7);
        pannellolabel2.add(l8);
        pannellolabel2.add(l9);
        pannellolabel2.add(l10);
        pannellolabel2.add(l11);
        pannellolabel2.add(l12);
        pannellolabel2.add(l13);

        //init pannello bevande1
        pannellobevande1 = new JPanel();
        pannellobevande1.setLayout(new GridLayout(7, 1, 15, 15));
        pannellobevande1.add(p0);
        pannellobevande1.add(p1);
        pannellobevande1.add(p2);
        pannellobevande1.add(p3);
        pannellobevande1.add(p4);
        pannellobevande1.add(p5);
        pannellobevande1.add(p6);

        //init pannello bevande2
        pannellobevande2 = new JPanel();
        pannellobevande2.setLayout(new GridLayout(7, 1, 15, 15));
        pannellobevande2.add(p7);
        pannellobevande2.add(p8);
        pannellobevande2.add(p9);
        pannellobevande2.add(p10);
        pannellobevande2.add(p11);
        pannellobevande2.add(p12);
        pannellobevande2.add(p13);

        //init label immagini 0-6
        x0 = new JLabel();
        x1 = new JLabel();
        x2 = new JLabel();
        x3 = new JLabel();
        x4 = new JLabel();
        x5 = new JLabel();
        x6 = new JLabel();

        //init immagini 0-6
        x0.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x1.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x2.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x3.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x4.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x5.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x6.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));

        //init pannello immagini  label3
        pannellolabel3 = new JPanel();
        pannellolabel3.setLayout(new GridLayout(7, 1, 15, 15));
        pannellolabel3.add(x0);
        pannellolabel3.add(x1);
        pannellolabel3.add(x2);
        pannellolabel3.add(x3);
        pannellolabel3.add(x4);
        pannellolabel3.add(x5);
        pannellolabel3.add(x6);

        //init label immagini 7-13
        x7 = new JLabel();
        x8 = new JLabel();
        x9 = new JLabel();
        x10 = new JLabel();
        x11 = new JLabel();
        x12 = new JLabel();
        x13 = new JLabel();

        //init immagini 7-13
        x7.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x8.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x9.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x10.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x11.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x12.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));
        x13.setIcon(new ImageIcon("src/IMMAGINI/1.jpg"));

        //init pannello immagini  label4
        pannellolabel4 = new JPanel();
        pannellolabel4.setLayout(new GridLayout(7, 1, 15, 15));
        pannellolabel4.add(x7);
        pannellolabel4.add(x8);
        pannellolabel4.add(x9);
        pannellolabel4.add(x10);
        pannellolabel4.add(x11);
        pannellolabel4.add(x12);
        pannellolabel4.add(x13);

        //init pannello bevandeW
        pannellobevandeW = new JPanel();
        pannellobevandeW.setLayout(new GridLayout(1, 2, 0, 15));
        pannellobevandeW.add(pannellolabel3);
        pannellobevandeW.add(pannellolabel1);

        //init pannello bevandeC
        pannellobevandeC = new JPanel();
        pannellobevandeC.setLayout(new GridLayout(1, 2, 15, 15));
        pannellobevandeC.add(pannellobevande1);
        pannellobevandeC.add(pannellobevande2);

        //init pannello bevandeE
        pannellobevandeE = new JPanel();
        pannellobevandeE.setLayout(new GridLayout(1, 2, 15, 15));
        pannellobevandeE.add(pannellolabel2);
        pannellobevandeE.add(pannellolabel4);


        //main frame
        //setTitle("pannelloprodotti");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
       // setResizable(true);
        setLayout(new BorderLayout());
        setSize(650, 400);
        setLocation(250, 50);
        //
        add(pannellobevandeW, BorderLayout.WEST);
        add(pannellobevandeC, BorderLayout.CENTER);
        add(pannellobevandeE, BorderLayout.LINE_END);

    }

}

class testvistacliente {

    public static void main(String[] args) {

        PannelloProdotti x = new PannelloProdotti();

        x.setVisible(true);

    }

}
