package com.school_dipendente;

public class Main {

    public static void main(String[] args) {
        Dipendente PafshimCanje = new Dipendente("Pafshim", "Canje",
                "Operatore di Call Center Vodafone Italia", 550F);

        System.out.println("\nNome: " + Dipendente.Mario + "\nCognome: " + Dipendente.Rossi
        + "\nMansione: " + Dipendente.compito);
        Dipendente.setStipendio(550F);
        System.out.println("\nStipendio: " + Dipendente.getStipendio());
    }
}
