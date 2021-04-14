package com.interfaccia;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JButton kButton;
    int totale;

    public App() {
        kButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox1.isSelected()) {
                    totale = totale + 10;
                }
                if(checkBox2.isSelected()) {
                    totale = totale + 20;
                }
                if(checkBox3.isSelected()) {
                    totale = totale + 80;
                }
                if(checkBox4.isSelected()) {
                    totale = totale + 100;
                }
                JOptionPane.showMessageDialog(null, "cingo de tu madre: " + totale);

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        checkBox1= new JCheckBox(new ImageIcon("immagine1.jpg"));
        checkBox2= new JCheckBox(new ImageIcon("immagine2.jpg"));
        checkBox3= new JCheckBox(new ImageIcon("immagine3.jpg"));
        checkBox4= new JCheckBox(new ImageIcon("immagine4.jpg"));


    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
