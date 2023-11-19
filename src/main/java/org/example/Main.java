package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Początek - start
        Scanner scan = new Scanner(System.in);
        //Podaj wartość a (operacja wejścia)
        System.out.println("Podaj wartość a: ");
        int a = scan.nextInt();
        //Podaj wartość b (operacja wejścia)
        System.out.println("Podaj wartość b: ");
        int b = scan.nextInt();
        //Podaj wartość c (operacja wejścia)
        System.out.println("Podaj wartość c: ");
        int c = scan.nextInt();

        //Blok operacji
       int suma = a + b + c;

       //Blok wyjścia z programu
       System.out.println(suma);
        //KONIEC


    }
}