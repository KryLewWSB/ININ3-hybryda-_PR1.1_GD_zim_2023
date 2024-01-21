package org.example;

public class Pracownik implements WypiszDanePersonalne{
    public String imie;
    public String nazwisko;
    public Integer wynagrodzenie;
    public Dzial dzial;

    public Pracownik(String imie, String nazwisko, Integer wynagrodzenie, Dzial dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
        this.dzial = dzial;
    }

    @Override
    public void wypiszDane() {
        System.out.println("--------------------\n" +
                            "Imię: " + this.imie +
                            "\nNazwisko: " + this.nazwisko +
                            "\nWynagrodzenie: " + this.wynagrodzenie +
                            "\nDział: " + this.dzial +
                            "\n--------------------\n");
    }
}
