package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj wartość do sprawdzenia: [zatwierdź enterem]");
            int odebranaWartosc = scan.nextInt();
            System.out.println(odebranaWartosc % 5 == 0 ? "Liczba " + odebranaWartosc + " jest podzielna przez 5!" :
                    "Liczba " + odebranaWartosc + " NIE jest podzielna przez 5!");

            System.out.println("Czy kontynuować? [T / N]");
            String czyKontynuowac = scan.next();
            if(czyKontynuowac.equals("N")) break;
        }

    }
}