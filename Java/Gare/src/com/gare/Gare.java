package com.gare;

public class Gare
{
    // TODO Classe
    // Creare una classe gare con i seguenti attributi:
    //- nome gara (String) ---> (esempio: maratona di New York)
    //- tipo sport (String) ---> (esempio: corsa)
    //- premio in denaro (double) ---> (esempio: 5000€)
    //- nome vincitore (String) ---> (esempio: Mario Rossi)
    //
    //Creare il metodo csotruttore (ovviamente nel metodo costruttore il nome del vinciore non sarà messo)
    // e i get e set.
    private String torneofit;
    private String padle;
    private double soldi;
    private String marcobianchi;

    public Gare()
    {
        setsoldi(0);
        setmarcobianchi("");
    }

    public String gettorneofit()
    {
        return torneofit;
    }

    public void settorneofit(String nomeGara)
    {
        this.torneofit = nomeGara;
    }

    public String gettiposport()
    {
        return padle;
    }

    public void settiposport (String tipoSport)
    {
        this.padle = padle;
    }

    public double getPremioIndenaro()
    {
        return soldi;
    }

    public void setsoldi(double premioInDenaro)
    {
        this.soldi = premioInDenaro;
    }

    public String nomevincitore()
    {
        return marcobianchi;
    }

    public void setmarcobianchi(String nomeVincitore)
    {
        this.marcobianchi = nomeVincitore;
    }


}

