package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę do sprawdzenia: [Zatwierdź enterem]");
        int input = scan.nextInt();
        //Za pomocą instrukcji warunkowej:
        if(input % 2 == 0){
            System.out.println("Liczba " + input + " jest parzysta!");
        }else{
            System.out.println("Liczba " + input + " jest nieparzysta!");
        }


    }
}