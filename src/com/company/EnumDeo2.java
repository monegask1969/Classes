package com.company;

/**
 * Created by uitschool JV on 1/31/2016.
 */
public class EnumDeo2 {
    public static void main(String[] args) {
        Enumss ap;
        System.out.println("Here are all Apple constants");

        Enumss allapples[] = Enumss.values();
        for(Enumss a : allapples)
           System.out.println(a);
        System.out.println();

        ap = Enumss.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
