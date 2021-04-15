package com.hotel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel panel1;
    private JCheckBox parcheggio;
    private JCheckBox cameramatrimoniale;
    private JCheckBox fumatori;
    private JButton confermaButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel foto;
    String stampaggio;

    public App() {
        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fumatori.isSelected()) {
                    stampaggio = stampaggio + "\n- Fumatore";
                }
                if(cameramatrimoniale.isSelected()) {
                    stampaggio = stampaggio + "\n- Camera Matrimoniale";
                }
                if(parcheggio.isSelected()) {
                    stampaggio = stampaggio + "\n- Parcheggio";
                }

                JOptionPane.showMessageDialog(null, stampaggio);
                confermaButton.setVisible(false);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        foto = new JLabel(new ImageIcon("immagine1.jpg"));

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
