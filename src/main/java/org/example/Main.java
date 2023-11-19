package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Podaj miesiąc w formie liczbowej: [Zatwierdź enterem] wpisz \"x\", żeby zatrzymać!");
            String miesiac = scan.next();

            if(miesiac.equals("x")) break;
            //if(miesiac == "1")    if(miesiac.equals("1"))
            switch (miesiac) {
                case "1" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Styczeń!");
                case "2" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Luty!");
                case "3" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Marzec!");
                case "4" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Kwiecień!");
                case "5" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Maj!");
                case "6" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Czerwiec!");
                case "7" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Lipiec!");
                case "8" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Sierpień!");
                case "9" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Wrzesień!");
                case "10" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Październik!");
                case "11" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Listopad!");
                case "12" -> System.out.println("Podałeś liczbę: " + miesiac + " jest to miesiąć Grudzień!");
                default -> System.out.println("Podałeś liczbę: " + miesiac + " jest to niepoprawna wartość!");
            }
        }



    }
}