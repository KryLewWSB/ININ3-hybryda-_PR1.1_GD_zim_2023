package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Zadanie 11 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scan.nextInt();

        if(liczba > 0){
            System.out.println("Liczba to: " + liczba);
        }else if (liczba < 0){
            System.out.println("Liczba to: " + Math.abs(liczba));
        }

    }
}