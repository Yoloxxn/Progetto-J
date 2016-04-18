/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author MZ
 */
public class PannelloConsole extends JPanel {

    private JPanel pannelloconsole;

    private JButton start, reset, exit;

    public PannelloConsole() {
        initComp();
    }

    private void initComp() {
        //init pulsanti console
        start = new JButton("START");
        reset = new JButton("RESET");
        exit = new JButton("EXIT");

        //init pannello console
        pannelloconsole = new JPanel();
        pannelloconsole.setLayout(new GridLayout(1, 3, 15, 15));
        pannelloconsole.add(start);
        pannelloconsole.add(reset);
        pannelloconsole.add(exit);

        //mainframe
        //setTitle("pannello console");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);
        setLayout(new BorderLayout());
        setSize(300, 80);
        setLocation(250, 50);
        //
        add(pannelloconsole, BorderLayout.CENTER);

    }

}

class testPannelloConsole {

    public static void main(String[] args) {

        PannelloConsole x = new PannelloConsole();

        x.setVisible(true);

    }
}
