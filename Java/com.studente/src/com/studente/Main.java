package com.studente;

public class Main {

    public static void main(String[] args) {


//creare la classe studente con i seguenti attributi: codicealunno, cognome, nome, classe, voto.
//  creare il metodo costruttore per inserire il  codicealunno, cognome, nome e classe, mentre il voto deve essere posto a zero;
//   creare metodi get, set e stampa;
//   creare il metodo aggiungivoto, per inserire il voto all'alunno;
//   creare il metodo modificaclasse, per modificare la classe dell'alunno con la classe nuova inserita da tastiera;
//   creare il metodo esito, per visualizzare se alunno è promosso(se voto >= a 6), respinto( se voto<di 6);

//   dopo aver inserito 3 alunni
//    realizzare un menu con le seguenti opzioni:
//     1..aggiungi voto;
//    2..modifica classe alunno;
//    3.. esito alunno;
//     4.. media degli alunni;
//    5.. fine

        class studente {
            private String codicealunno;
            private String cognome;
            private String nome;
            private String classe;
            private double voto;

            public studente() {
                setvoto(0);
                setclasse("");
            }


            public String getcodicealunno() {
                return codicealunno;
            }

            public void setcodicealunno(String codicealunno) {
                this.codicealunno = codicealunno;
            }

            public String getcognome() {
                return cognome;
            }

            public void setcognome(String cognome) {
                this.cognome = cognome;
            }

            public String getnome() {
                return nome;
            }

            public void setnome(String nome) {
                this.nome = nome;
            }

            public String classe() {
                return classe;
            }

            public void setclasse(String classe) {
                this.classe = classe;
            }
            public Double getvoto(){
                return voto;
            }
            public void setvoto(double voto) {
                this.voto= voto;
            }
        }
    }
}
