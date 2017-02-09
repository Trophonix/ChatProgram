/*
 * Created by JFormDesigner on Wed Feb 08 22:58:37 CST 2017
 */

package com.trophonix.chatprogram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Lucas Cosolo
 */
public class Login extends JFrame {
    public Login() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        setSize(340, 365);
        pack();
    }

    private void registerButtonMouseClicked(MouseEvent e) {
        registerButtonActionPerformed(null);
    }

    private void registerButtonActionPerformed(ActionEvent e) {
        dispose();
        new Register();
    }

    private void recoverButtonMouseClicked(MouseEvent e) {
        recoverButtonActionPerformed(null);
    }

    private void recoverButtonActionPerformed(ActionEvent e) {
        dispose();
        new Recover();
    }

    private void loginButtonMouseClicked(MouseEvent e) {
        loginButtonActionPerformed(null);
    }

    private void loginButtonActionPerformed(ActionEvent e) {
        dispose();
        new Chat(usernameField.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Lucas Cosolo
        label1 = new JLabel();
        usernameField = new JTextField();
        label2 = new JLabel();
        passwordField = new JPasswordField();
        loginButton = new JButton();
        label4 = new JLabel();
        label3 = new JLabel();
        registerButton = new JButton();
        recoverButton = new JButton();
        response = new JLabel();

        //======== this ========
        setTitle("Login");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {25, 25, 25, 25, 25, 0, 25, 25, 25, 25, 25, 0, 20, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {25, 0, 30, 30, 30, 20, 30, 20, 0, 0, 15, 25, 10, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

        //---- label1 ----
        label1.setText("Username");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);
        label1.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label1, new GridBagConstraints(3, 1, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- usernameField ----
        usernameField.setToolTipText("Enter Username");
        contentPane.add(usernameField, new GridBagConstraints(2, 2, 9, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("Password");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label2, new GridBagConstraints(3, 3, 7, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- passwordField ----
        passwordField.setToolTipText("Enter Password");
        contentPane.add(passwordField, new GridBagConstraints(2, 4, 9, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- loginButton ----
        loginButton.setText("Login");
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loginButtonMouseClicked(e);
            }
        });
        loginButton.addActionListener(e -> loginButtonActionPerformed(e));
        contentPane.add(loginButton, new GridBagConstraints(4, 6, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText("Don't have an account?");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label4, new GridBagConstraints(1, 8, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("Forgot your password?");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setVerticalAlignment(SwingConstants.BOTTOM);
        contentPane.add(label3, new GridBagConstraints(7, 8, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- registerButton ----
        registerButton.setText("Register");
        registerButton.setVerticalAlignment(SwingConstants.TOP);
        registerButton.addActionListener(e -> registerButtonActionPerformed(e));
        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registerButtonMouseClicked(e);
            }
        });
        contentPane.add(registerButton, new GridBagConstraints(1, 9, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- recoverButton ----
        recoverButton.setText("E-Mail Me");
        recoverButton.setVerticalAlignment(SwingConstants.TOP);
        recoverButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                recoverButtonMouseClicked(e);
            }
        });
        recoverButton.addActionListener(e -> recoverButtonActionPerformed(e));
        contentPane.add(recoverButton, new GridBagConstraints(7, 9, 5, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- response ----
        response.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(response, new GridBagConstraints(1, 11, 11, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        setSize(340, 365);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Lucas Cosolo
    private JLabel label1;
    private JTextField usernameField;
    private JLabel label2;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel label4;
    private JLabel label3;
    private JButton registerButton;
    private JButton recoverButton;
    private JLabel response;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        new Login();
    }

}
