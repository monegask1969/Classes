package com.company;

/**
 * Created by uitschool JV on 1/31/2016.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Enumss ap;
        ap = Enumss.RedDel;
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Enumss.GoldenDel;

        if(ap == Enumss.GoldenDel)
            System.out.println("ap contains GoldenDel");
        switch (ap)
        {
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious is yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious is red");
                break;
            case Winesap:
                System.out.println("Winesap is red");
                break;
            case Cortland:
                System.out.println("Cortland is red");
                break;
        }
    }
}
