package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Zadanie 18. Kalkulator podatku dochodowego:
            Napisz program, który na podstawie dochodu użytkownika obliczy należny podatek dochodowy.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź swój dochód za dany rok: ");
        float dochod = scan.nextFloat();
        int kwota = 120_000;

        if(dochod < kwota){
            System.out.println("Podatek do zapłacenia: " + (dochod * 0.12));
        } else if (dochod > kwota) {
            double pierwszyProgPodatkowy = kwota * 0.12;
            double drugiProgPodatkowy = (dochod - kwota) * 0.32;

            double ileDoZaplaty = pierwszyProgPodatkowy + drugiProgPodatkowy;
            System.out.println("Zaliczasz się do drugiego progu podatkowego, musisz zapłacić: " + ileDoZaplaty );
            System.out.println("12 % podatku od kwoty 120 000 zł: " + pierwszyProgPodatkowy);
            System.out.println("32 % podatku od kwoty " + (dochod - kwota) + " wynosi: " + drugiProgPodatkowy);

        }

    }
}