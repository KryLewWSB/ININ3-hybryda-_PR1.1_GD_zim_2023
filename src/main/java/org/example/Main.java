package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik("Adam", "Kowalski", 5_000);
        Pracownik pracownik2 = new Pracownik("Monika", "Kowal", 6_000);
        pracownik1.wypiszDane();
        pracownik2.wypiszDane();


    }
}