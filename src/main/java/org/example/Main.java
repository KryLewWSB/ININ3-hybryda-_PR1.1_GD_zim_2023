package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Pracownik> listaPracownicy = new ArrayList<>();
        List<Kierownik> listaKierownicy= new ArrayList<>();

        Pracownik pracownik1 = new Pracownik("Adam", "Kowalski", 5_000, Dzial.BIBLIOTEKA);
        Pracownik pracownik2 = new Pracownik("Monika", "Kowal", 6_000, Dzial.IT);
        listaPracownicy.add(pracownik1);
        listaPracownicy.add(pracownik2);
        Kierownik kierownik3 = new Kierownik("Andrzej", "Nowak", 5_000, Dzial.IT, 3_000);
        Kierownik kierownik4 = new Kierownik("Anna", "Nowak", 6_000, Dzial.KSIEGOWSC, 2_000);
        listaKierownicy.add(kierownik3);
        listaKierownicy.add(kierownik4);

        for(Pracownik praciwnik: listaPracownicy){
            praciwnik.wypiszDane();
        }
        for(Kierownik kierownik: listaKierownicy){
            kierownik.wypiszDane();
        }

    }
}