package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać liczbę, która ma zostać spotęgowana: [zatwierdź enterem]");
        int wartosc1 = scan.nextInt(); //pobiera pierwszą wartość z konsoli
        System.out.println("Proszę podać liczbę, do której potęgi chcesz podnieść liczbę: " + wartosc1 + " [zatwierdź enterem]");
        int wartosc2 = scan.nextInt(); //pobiera drugą wartość z konsoli

        int liczba2 = (int) Math.pow(wartosc1, wartosc2);
        System.out.println( "Liczba " + wartosc1 + " podniesiona do potęgi: " + wartosc2 + " jest równa: " + liczba2 );

    }
}