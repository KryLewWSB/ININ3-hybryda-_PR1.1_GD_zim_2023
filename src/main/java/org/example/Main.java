package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Zadanie 12 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scan.nextInt();

        switch (liczba){
            case 1, 4, 8 -> System.out.println("Liczba to 1, 4 lub 8.");
            case 2, 3, 7 -> System.out.println("Liczba to 2, 3 lub 7.");
            default -> System.out.println("Jakaś wartośc...");
        }


    }
}