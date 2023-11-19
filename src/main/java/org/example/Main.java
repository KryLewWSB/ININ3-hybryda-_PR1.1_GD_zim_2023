package org.example;

public class Main {
    public static void main(String[] args) {
        int liczba = 25;
        //blok instrukcji warunkowych
        if(liczba > 10) {
            System.out.println("Liczba większa od 10: ");
        }else if(liczba > 15) {
            System.out.println("Liczba większa od 15: ");
        }else if (liczba > 20){
            System.out.println("Liczba większa od 20: ");
        }else{
            System.out.println("Liczba jest inna... ");
        }


    }
}