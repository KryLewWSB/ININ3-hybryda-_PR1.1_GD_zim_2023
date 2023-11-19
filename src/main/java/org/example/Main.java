package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę do sprawdzenia: [Zatwierdź enterem]");
        int input = scan.nextInt();
        //Za pomocą operatora warunkowego:
        System.out.println( input % 2 == 0 ?
                "Liczba " + input + " jest parzysta!" :
                "Liczba " + input + " jest nieparzysta!");



    }
}