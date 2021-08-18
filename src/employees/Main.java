/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author George
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }

        MainFrame mainframe = new MainFrame();
        mainframe.setSize(650, 400);
        mainframe.getContentPane().setBackground(Color.WHITE);
        mainframe.setLocationRelativeTo(null);
        mainframe.setVisible(true);
    }

}

