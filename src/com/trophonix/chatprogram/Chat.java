/*
 * Created by JFormDesigner on Wed Feb 08 22:42:26 CST 2017
 */

package com.trophonix.chatprogram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Lucas Cosolo
 */
public class Chat extends JFrame {

    private String name;

    public Chat(String name) {
        this.name = name;
        initComponents();
        setSize(555, 455);
        pack();
    }

    private void sendButtonMouseClicked(MouseEvent e) {
        sendButtonActionPerformed(null);
    }

    private void sendButtonActionPerformed(ActionEvent e) {
        chatFieldActionPerformed(null);
    }

    private void chatFieldActionPerformed(ActionEvent e) {
        String message = chatField.getText();
        if (message == null || message.isEmpty() || message.replace(" ", "").isEmpty()) return;
        append(name + ": " + message);
        chatField.setText("");
    }

    private void append(String message) {
        chatArea.append(message + "\n");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Lucas Cosolo
        menuBar1 = new JMenuBar();
        scrollPane1 = new JScrollPane();
        chatArea = new JTextArea();
        chatField = new JTextField();
        sendButton = new JButton();
        emojiButton = new JButton();

        //======== this ========
        setTitle("Trophonix Chat");
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {20, 405, 50, 25, 15, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {20, 292, 25, 10, 32, 15, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        setJMenuBar(menuBar1);

        //======== scrollPane1 ========
        {

            //---- chatArea ----
            chatArea.setEditable(false);
            scrollPane1.setViewportView(chatArea);
        }
        contentPane.add(scrollPane1, new GridBagConstraints(1, 1, 3, 2, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- chatField ----
        chatField.addActionListener(e -> chatFieldActionPerformed(e));
        contentPane.add(chatField, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- sendButton ----
        sendButton.setText("Send");
        sendButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sendButtonMouseClicked(e);
            }
        });
        sendButton.addActionListener(e -> sendButtonActionPerformed(e));
        contentPane.add(sendButton, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- emojiButton ----
        emojiButton.setText(":)");
        contentPane.add(emojiButton, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        setSize(555, 455);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Lucas Cosolo
    private JMenuBar menuBar1;
    private JScrollPane scrollPane1;
    private JTextArea chatArea;
    private JTextField chatField;
    private JButton sendButton;
    private JButton emojiButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
