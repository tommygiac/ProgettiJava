package com.school_dipendente;

// DONE Creare la Classe Dipendente con: attributi Nome,
// DONE Cognome, Mansione, Stipendio, il metodo Costruttore e
// DONE metodi necessari per gestire il programma.

public class Dipendente {
    public static String Mario;
    public static String Rossi;
    public static String compito;
    private static float duemilaeuro;

    public Dipendente(String nome, String cognome, String mansione, float stipendio) {
        this.Mario = nome;
        this.Rossi = cognome;
        this.compito = mansione;
    }

    public static float getStipendio() {
        return duemilaeuro;
    }

    public static void setStipendio(float stipendio) {
        Dipendente.duemilaeuro = stipendio;
    }
}
