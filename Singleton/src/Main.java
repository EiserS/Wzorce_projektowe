//Damian Pawlik 109484
/*Singleton gwarantuje, że konfiguracja jest wczytywana tylko raz, a wszystkie części aplikacji korzystają z tej samej instancji.
Jest to bardziej wydajne i eliminuje potrzebę wielokrotnego odczytywania tych samych danych.*/

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Transport.getInstance();
        //Zastosowanie Singleton zabrania użycia konstruktora
        //Transport transport = new Transport();

    }
}