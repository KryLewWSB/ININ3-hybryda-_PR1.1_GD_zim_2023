package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);//kodowanie znaków US
        System.out.println("Podaj wartość float: ");
        float liczba = scan.nextFloat();

        System.out.println(liczba);

    }
}