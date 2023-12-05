//Damian Pawlik 109484
/*
Mediator to wzorzec projektowy behawioralny, który umożliwia redukcję bezpośrednich powiązań pomiędzy różnymi komponentami systemu poprzez wprowadzenie pośrednika, który zarządza komunikacją między nimi.
Głównym celem Mediatora jest zwiększenie spójności i zmniejszenie zależności między poszczególnymi elementami systemu poprzez skupienie logiki komunikacji w jednym miejscu.
Dzięki temu komponenty nie muszą bezpośrednio odwoływać się do siebie, co ułatwia rozszerzanie systemu i utrzymanie go.
 */
// Interfejs mediatora odpowiedzialny za koordynację działań postaci
interface Mediator {
    void wykonajAtak(Postac postac);
}

// Konkretny mediator zarządzający atakami postaci
class GraMediator implements Mediator {
    @Override
    public void wykonajAtak(Postac postac) {
        System.out.println("Mediator koordynuje atak postaci.");
        postac.atak();
    }
}

// Interfejs reprezentujący postać w grze
interface Postac {
    void atak();
}

// Konkretne klasy postaci
class Rycerz implements Postac {
    @Override
    public void atak() {
        System.out.println("Rycerz wykonuje atak mieczem.");
    }
}

class Lucznik implements Postac {
    @Override
    public void atak() {
        System.out.println("Łucznik strzela z łuku.");
    }
}

class Wojownik implements Postac {
    @Override
    public void atak() {
        System.out.println("Wojownik atakuje pięściami.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new GraMediator();

        // Tworzenie różnych postaci i wykonywanie ataków za pośrednictwem mediatora
        Postac rycerz = new Rycerz();
        Postac lucznik = new Lucznik();
        Postac wojownik = new Wojownik();

        mediator.wykonajAtak(rycerz);
        mediator.wykonajAtak(lucznik);
        mediator.wykonajAtak(wojownik);
    }
}