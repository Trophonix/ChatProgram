/*
 * Created by JFormDesigner on Wed Feb 08 23:45:03 CST 2017
 */

package com.trophonix.chatprogram;

import java.awt.*;
import javax.swing.*;

/**
 * @author Lucas Cosolo
 */
public class Recover extends JFrame {
    public Recover() {
        initComponents();
        setSize(280, 225);
        pack();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Lucas Cosolo
        label4 = new JLabel();
        passwordField = new JPasswordField();
        registerButton = new JButton();
        response = new JLabel();

        //======== this ========
        setTitle("Recover Password");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 20, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {25, 0, 0, 25, 0, 15, 25, 10, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label4 ----
        label4.setText("E-Mail");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label4, new GridBagConstraints(3, 1, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(passwordField, new GridBagConstraints(2, 2, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- registerButton ----
        registerButton.setText("Register");
        contentPane.add(registerButton, new GridBagConstraints(3, 4, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(response, new GridBagConstraints(1, 6, 9, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        setSize(280, 225);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Lucas Cosolo
    private JLabel label4;
    private JPasswordField passwordField;
    private JButton registerButton;
    private JLabel response;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
