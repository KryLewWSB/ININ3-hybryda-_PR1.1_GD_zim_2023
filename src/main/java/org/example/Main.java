package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Zadanie 22 */
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj liczbę 1: ");
            int liczba1 = scan.nextInt();
            System.out.println("Podaj liczbę 2: ");
            int liczba2 = scan.nextInt();
            System.out.println("Podaj operator (+,-,*,/): ");
            String operator = scan.next();

            switch (operator) {
                case "+" -> System.out.println("Wynik dodawania: " + liczba1 + " + " + liczba2 + " = " + (liczba1 + liczba2));
                case "-" -> System.out.println("Wynik odejmowania: " + liczba1 + " - " + liczba2 + " = " + (liczba1 - liczba2));
                case "*" -> System.out.println("Wynik mnożenia: " + liczba1 + " * " + liczba2 + " = " + (liczba1 * liczba2));
                case "/" -> System.out.println("Wynik dodawania: " + liczba1 + " / " + liczba2 + " = " + (liczba1 / liczba2));
            }

            System.out.println("Jeśli chcesz kontynować kliknij T a jeśli nie to N.");
            String czyKontynuowac = scan.next();
            if(czyKontynuowac.equals("N") || czyKontynuowac.equals("n") || czyKontynuowac.equals("x")) break;

        }



    }
}