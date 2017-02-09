/*
 * Created by JFormDesigner on Wed Feb 08 23:35:06 CST 2017
 */

package com.trophonix.chatprogram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Lucas Cosolo
 */
public class Register extends JFrame {
    public Register() {
        initComponents();
        setSize(285, 395);
        pack();
    }

    private void registerButtonMouseClicked(MouseEvent e) {
        registerButtonActionPerformed(null);
    }

    private void registerButtonActionPerformed(ActionEvent e) {
        dispose();
        new Chat(usernameField.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Lucas Cosolo
        label1 = new JLabel();
        usernameField = new JTextField();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        label3 = new JLabel();
        passwordField2 = new JPasswordField();
        label4 = new JLabel();
        emailField = new JTextField();
        registerButton = new JButton();
        response = new JLabel();

        //======== this ========
        setTitle("Register");
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 20, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {25, 24, 30, 25, 30, 25, 30, 25, 0, 25, 0, 15, 25, 10, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("Username");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);
        label1.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label1, new GridBagConstraints(2, 1, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- usernameField ----
        usernameField.setToolTipText("Enter Username");
        contentPane.add(usernameField, new GridBagConstraints(2, 2, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("Password");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label2, new GridBagConstraints(2, 3, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- passwordField1 ----
        passwordField1.setToolTipText("Enter Password");
        contentPane.add(passwordField1, new GridBagConstraints(2, 4, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("Confirm Password");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label3, new GridBagConstraints(2, 5, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- passwordField2 ----
        passwordField2.setToolTipText("Re-Enter Password");
        contentPane.add(passwordField2, new GridBagConstraints(2, 6, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText("E-Mail (Optional)");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label4, new GridBagConstraints(3, 7, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(emailField, new GridBagConstraints(2, 8, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- registerButton ----
        registerButton.setText("Register");
        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registerButtonMouseClicked(e);
            }
        });
        registerButton.addActionListener(e -> registerButtonActionPerformed(e));
        contentPane.add(registerButton, new GridBagConstraints(3, 10, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- response ----
        response.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(response, new GridBagConstraints(1, 12, 9, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        setSize(285, 395);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Lucas Cosolo
    private JLabel label1;
    private JTextField usernameField;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JLabel label3;
    private JPasswordField passwordField2;
    private JLabel label4;
    private JTextField emailField;
    private JButton registerButton;
    private JLabel response;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
