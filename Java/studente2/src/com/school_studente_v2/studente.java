package com.school_studente_v2;
//DONE creare la classe studente con i seguenti attributi: codicealunno, cognome, nome, classe, voto.
//DONE creare il metodo costruttore per inserire il  codicealunno, cognome, nome e classe,
// mentre il voto deve essere posto a zero;
//DONE creare metodi get, set e stampa;
//DONE creare il metodo aggiungivoto, per inserire il voto all'alunno;
//DONE creare il metodo modificaclasse, per modificare la classe dell'alunno con la classe nuova inserita da tastiera;
//DONE creare il metodo esito, per visualizzare se alunno è promosso(se voto >= a 6), respinto( se voto<di 6);

public class studente
{
    private String codiceAlunno;
    private String cognome;
    private String nome;
    private String classe;
    private float voto = 0;

    // Constructor
    public studente() {
    }

    // Getter and Setter

    public String getCodiceAlunno() {
        return codiceAlunno;
    }

    public void setCodiceAlunno(String codiceAlunno) {
        this.codiceAlunno = codiceAlunno;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public float getVoto() {
        return voto;
    }

    public void setVoto(float voto) {
        this.voto = voto;
    }

    // Input()

    studente(String codiceAlunno, String cognome, String nome, String classe) {
        this.codiceAlunno = codiceAlunno;
        this.cognome = cognome;
        this.nome = nome;
        this.classe = classe;
    }

    // Metodi

    public void stampa() {
        System.out.println("\nCodice Alunno: " + getCodiceAlunno() +
                "\nNome: " + getNome() + " " + getCognome()
                + "\nClasse: " + getClasse() + "\nVoto: " + getVoto());
    }

    public void aggiungiVoto(float inputVoto) {
        voto = inputVoto;
        }
    public void esito() {
        if (voto >= 5.6) {
            System.out.println("\n Lo studente e' promosso");
        }
        else {
            System.out.println("\n Lo studente  e' bocciato.");
        }
    }


    public void modificaClasse_CodiceAlunno (String inputCodiceAlunno) {
        setCodiceAlunno(inputCodiceAlunno);
    }

    public void modificaClasse_Cognome(String inputCognome) {
        setCognome(inputCognome);
    }

    public void modificaClasse_Nome(String inputNome) {
        setNome(inputNome);
    }

    public void modificaClasse_Classe(String inputClasse) {
        setClasse(inputClasse);
    }

    public void modificaClasse_Voto(float inputVoto) {
        setVoto(inputVoto);
    }
}



