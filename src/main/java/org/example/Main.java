package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj miesiąc w formie liczbowej: [Zatwierdź enterem]");
        int miesiac = scan.nextInt();

        switch (miesiac){
            case 1:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Styczeń!");
                break;
            case 2:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Luty!");
                break;
            case 3:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Marzec!");
                break;
            case 4:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Kwiecień!");
                break;
            case 5:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Maj!");
                break;
            case 6:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Czerwiec!");
                break;
            case 7:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Lipiec!");
                break;
            case 8:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Sierpień!");
                break;
            case 9:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Wrzesień!");
                break;
            case 10:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Październik!");
                break;
            case 11:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Listopad!");
                break;
            case 12:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Grudzień!");
                break;
            default:
                System.out.println("Podałeś liczbę: " + miesiac + " jest to niepoprawna wartość!");
        }



    }
}