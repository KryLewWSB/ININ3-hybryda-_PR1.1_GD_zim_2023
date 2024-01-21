package org.example;

public class Pracownik implements WypiszDanePersonalne{
    public String imie;
    public String nazwisko;
    public Integer wynagrodzenie;

    public Pracownik(String imie, String nazwisko, Integer wynagrodzenie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void wypiszDane() {
        System.out.println("--------------------\n" +
                            "Imię: " + this.imie +
                            "\nNazwisko: " + this.nazwisko +
                            "\nWynagrodzenie: " + this.wynagrodzenie +
                            "\n--------------------\n");
    }
}
