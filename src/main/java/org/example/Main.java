package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int tablica[] = {1, 2, 3};
        for(int i = 0; i < tablica.length; i++){
            System.out.println("tab[" + i + "] = " + tablica[i]);
        }

        for (int liczba : tablica){
            System.out.println(liczba);
        }
    }
}