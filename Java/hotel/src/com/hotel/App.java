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

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public void setButton4(JButton button4) {
        this.button4 = button4;
    }

    public JLabel getFoto() {
        return foto;
    }

    public void setFoto(JLabel foto) {
        this.foto = foto;
    }
}
