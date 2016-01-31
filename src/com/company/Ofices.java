package com.company;

/**
 * Created by uitschool JV on 1/31/2016.
 */
public enum Ofices {
    Kharkov(5986203,3000000),Kiev(123975021,5000000),Lviv(6541032,1500000);

    private int territory, naselenie;
    Ofices(int territory, int naselenie)
    {
        territory = territory;
        naselenie = naselenie;
    }
    int getTerritory()
    {
        return territory;
    }
    int getNaselenie()
    {
        return naselenie;
    }

}
