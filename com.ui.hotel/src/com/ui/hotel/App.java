package com.ui.hotel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton Conferma;
    private JCheckBox Fumatore;
    private JCheckBox CameraMatrimoniale;
    private JCheckBox VistaSulMare;
    private JButton Informazioni;
    private JButton VisualizzaFoto;
    private JPanel panel1;
    private JLabel maxTryReached;
    private JLabel HotelPhoto;
    private JButton Button;
    private JComboBox comboBox1;
    private JLabel textPlat;

    boolean isSmokerSelected = false;
    boolean isMatrimonialeSelected = false;
    boolean isVistaMareSelected = false;
    String output = "Wybrałeś:\n";




    public App() {
        Conferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Fumatore.isSelected()) {
                    output = output + "\n- Fumatore";
                }
                if(CameraMatrimoniale.isSelected()) {
                    output = output + "\n- Camera Matrimoniale";
                }
                if(VistaSulMare.isSelected()) {
                    output = output + "\n- Parcheggio";
                }

                String inputComboBox;
                inputComboBox = (String) comboBox1.getSelectedItem();


                JOptionPane.showMessageDialog(null, output + "\n\nWybrana metoda płatności:"
                        + inputComboBox);
                Conferma.setVisible(false);
                comboBox1.setVisible(false);
                textPlat.setVisible(false);
                maxTryReached.setText("Koniec programu.\n Uruchom go ponownie, aby spróbować ponownie");

            }
        });
        Informazioni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Tommaso Giacomelli\n4AIA");
            }
        });
        VisualizzaFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HotelPhoto.setVisible(true);
                VisualizzaFoto.setVisible(false);
            }
        });
        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hotel Tommaso Giacomelli 4AIA");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        /* TODO: place custom component creation code here */
        HotelPhoto = new JLabel(new ImageIcon("fotowo.png"));
        HotelPhoto.setVisible(false);
    }

    public void setConferma(JButton conferma) {
        Conferma = conferma;
    }

    public void setFumatore(JCheckBox fumatore) {
        Fumatore = fumatore;
    }

    public JCheckBox getCameraMatrimoniale() {
        return CameraMatrimoniale;
    }

    public void setCameraMatrimoniale(JCheckBox cameraMatrimoniale) {
        CameraMatrimoniale = cameraMatrimoniale;
    }

    public JCheckBox getVistaSulMare() {
        return VistaSulMare;
    }

    public void setVistaSulMare(JCheckBox vistaSulMare) {
        VistaSulMare = vistaSulMare;
    }

    public JButton getInformazioni() {
        return Informazioni;
    }

    public void setInformazioni(JButton informazioni) {
        Informazioni = informazioni;
    }

    public JButton getVisualizzaFoto() {
        return VisualizzaFoto;
    }

    public void setVisualizzaFoto(JButton visualizzaFoto) {
        VisualizzaFoto = visualizzaFoto;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public void setMaxTryReached(JLabel maxTryReached) {
        this.maxTryReached = maxTryReached;
    }

    public void setWychodzićButton(JButton wychodzićButton) {
        this.Button = wychodzićButton;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public void setTextPlat(JLabel textPlat) {
        this.textPlat = textPlat;
    }

    public JButton getButton() {
        return Button;
    }

    public void setButton(JButton button) {
        Button = button;
    }
}
