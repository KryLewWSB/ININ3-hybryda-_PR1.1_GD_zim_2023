package org.example;

public class Kierownik extends Pracownik{
    public Integer premiaKierownicza;
    public Kierownik(String imie, String nazwisko, Integer wynagrodzenie, Dzial dzial, Integer premiaKierownicza) {
        super(imie, nazwisko, wynagrodzenie, dzial);
        this.premiaKierownicza = premiaKierownicza;
    }
    @Override
    public void wypiszDane() {
        System.out.println("--------------------\n" +
                "Imię: " + this.imie +
                "\nNazwisko: " + this.nazwisko +
                "\nWynagrodzenie: " + this.wynagrodzenie +
                "\nDział: " + this.dzial +
                "\nPremia Kierownicza: " + this.premiaKierownicza +
                "\n--------------------\n");
    }
}
