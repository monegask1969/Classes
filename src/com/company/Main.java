package com.company;

public class Main {

    public static void main(String[] args) {
        final int[] array = {1,2,3,4,5};

                for (int i = 0; i < array.length; i++) {
                    array[i] *= 2;
                    System.out.println(array[i]);
                }
    }
}
