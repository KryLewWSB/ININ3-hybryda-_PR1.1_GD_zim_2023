package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Przykład - gra w kości. */
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj liczbę (1 - 6): ");
            int liczbaUzytkownika = scan.nextInt();

            int wartoscWylosowana = (int) (Math.random() * 5) + 1; //generowanie wartości pseudolosowej w zakresie 1-6

            if (liczbaUzytkownika == wartoscWylosowana) {
                System.out.println("Brawo! Zgadłeś wylosowaną liczbę oczek!\nTwój wybór: " +
                        liczbaUzytkownika + "\nWylosowana wartość: " + wartoscWylosowana);
            } else {
                System.out.println("Niestety! Nie zgadłeś wylosowanej liczby oczek!\nTwój wybór: " +
                        liczbaUzytkownika + "\nWylosowana wartość: " + wartoscWylosowana);
            }
        }

    }
}