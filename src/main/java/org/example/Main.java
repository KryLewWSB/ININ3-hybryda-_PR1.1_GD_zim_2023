package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] tablicaLiczba = new int[5]; //deklaracja tablicy intów o długości 5

        tablicaLiczba[2] = 5;

        // 1 sposób wypisania tablicy:
        for(int liczba : tablicaLiczba){
            System.out.println(liczba);
        }

        System.out.println( Arrays.toString( tablicaLiczba ) ); //2 sposób wypisania
    }
}