package com.company;

/**
 * Created by uitschool JV on 1/31/2016.
 */
public class Ofice {
    private String direktor;
    private int kolvo_sotr;
    private Ofices city;

    Ofice(String direktor, int kolvo_sotr, Ofices city)
    {
        this.direktor = direktor;
        this.kolvo_sotr = kolvo_sotr;
        this.city = city;
    }

    public int getKolvo_sotr() {
        return kolvo_sotr;
    }

    public Ofices getCity() {
        return city;
    }

    public String getDirektor() {
        return direktor;
    }
}
