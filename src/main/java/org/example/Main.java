package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* Przykład - symulacja gry w lotto. */
        Scanner scan = new Scanner(System.in);


        /* Start - Przyjmowanie 6 unikalnych liczb od użytkownika */
        Set<Integer> liczbyPodanePrzezUzytkownika = new HashSet<>();
        while (liczbyPodanePrzezUzytkownika.size() < 6){
            System.out.println("Podaj liczbę: ");
            int podanaLiczba = scan.nextInt();
            if(podanaLiczba < 50 && podanaLiczba > 0 && !liczbyPodanePrzezUzytkownika.contains(podanaLiczba)){
                liczbyPodanePrzezUzytkownika.add(podanaLiczba);
            }else{
                System.out.println("Podałeś błędną liczbę, podaj inną...");
            }
        }
        /* Stop - Przyjmowanie 6 unikalnych liczb od użytkownika */
        System.out.println(liczbyPodanePrzezUzytkownika);

        /* Start - Losowanie 6 unikalnych liczb z metody random */
        Set<Integer> listaWylosowanychLIczb = new HashSet<>();
        while (listaWylosowanychLIczb.size() < 6){
            int wylosowanaLIczba = (int) (Math.random() * 48) + 1;
            if(!listaWylosowanychLIczb.contains(wylosowanaLIczba)){
                listaWylosowanychLIczb.add(wylosowanaLIczba);
            }
        }
        /* Stop - Losowanie 6 unikalnych liczb z metody random */
        System.out.println(listaWylosowanychLIczb);

        Set<Integer> liczbyTrafione = new HashSet<>();
        for(int liczba : listaWylosowanychLIczb){
            if(liczbyPodanePrzezUzytkownika.contains(liczba)){
                liczbyTrafione.add(liczba);
            }
        }

        System.out.println("Trafione liczby: " + liczbyTrafione);

        //int wartoscWylosowana = (int) (Math.random() * 48) + 1; //1 - 49




    }
}