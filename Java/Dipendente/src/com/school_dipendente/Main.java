package com.school_dipendente;

public class Main {

    public static void main(String[] args) {
        Dipendente PafshimCanje = new Dipendente("Mario", "Rossi",
                "Venditore di pizza", 1200F);

        System.out.println("\nNome: " + Dipendente.Mario + "\nCognome: " + Dipendente.Rossi
        + "\nMansione: " + Dipendente.compito);
        Dipendente.setStipendio(1200F);
        System.out.println("\nStipendio: " + Dipendente.getStipendio());
    }
}
