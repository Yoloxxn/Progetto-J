/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

/**
 *
 * @author MZ
 */
public class PannelloIstruzioni extends JPanel {

    private JTextArea displayistruzioni;

    private JPanel pannelloistruzioni;

    private JScrollPane barra;

    public PannelloIstruzioni() {
        initComp();
    }

    private void initComp() {
        //init display istruzioni
        displayistruzioni = new JTextArea("");
        displayistruzioni.setFont(new Font("Monospaced", Font.PLAIN, 12));

        //init barra
        barra = new JScrollPane(displayistruzioni, VERTICAL_SCROLLBAR_ALWAYS, HORIZONTAL_SCROLLBAR_NEVER);
        barra.setWheelScrollingEnabled(true);

        //iniz pannello istruzioni
        pannelloistruzioni = new JPanel();
        pannelloistruzioni.setLayout(new GridLayout(1, 1, 15, 15));
        pannelloistruzioni.add(barra);

        //mainframe 
        //setTitle("pannello istruzioni");
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(true);
        setLayout(new BorderLayout());
        setSize(300, 320);
        setLocation(250, 50);
        //
        add(pannelloistruzioni, BorderLayout.CENTER);
    }

}

class testPannelloIstruzioni {

    public static void main(String[] args) {

        PannelloIstruzioni x = new PannelloIstruzioni();
        x.setVisible(true);
    }
}
