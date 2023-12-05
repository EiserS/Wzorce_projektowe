//Damian Pawlik 109484
/*Dekorator jest wzorcem strukturalnym, który umożliwia dodawanie nowych funkcjonalności do istniejących obiektów dynamicznie, bez konieczności zmiany ich struktury.
Wzorzec ten opiera się na zasadzie opakowywania obiektów w inne obiekty, co pozwala na elastyczne dodawanie nowych zachowań lub cech obiektom już istniejącym w czasie działania programu.
Dekorator umożliwia rozszerzanie funkcjonalności obiektów, jednocześnie zachowując ich interfejsy oraz niezmienność struktury podstawowej.*/
// Interfejs reprezentujący postać w grze
interface Postac {
    void atak();
}

// Konkretna klasa reprezentująca Rycerza
class Rycerz implements Postac {
    @Override
    public void atak() {
        System.out.println("Rycerz wykonuje atak mieczem.");
    }
}

// Dekorator dodający umiejętność strzelania łukiem
class UmiejetnoscStrzelania implements Postac {
    private final Postac postac;

    public UmiejetnoscStrzelania(Postac postac) {
        this.postac = postac;
    }

    @Override
    public void atak() {
        postac.atak();
        System.out.println("Dodatkowo rycerz potrafi strzelać z łuku.");
    }
}

public class Main {
    public static void main(String[] args) {
        Postac rycerz = new Rycerz();
        rycerz.atak(); // Wywołanie podstawowej akcji rycerza

        // Dodanie umiejętności strzelania łukiem do rycerza (dekorator)
        Postac rycerzZLukiem = new UmiejetnoscStrzelania(new Rycerz());
        rycerzZLukiem.atak(); // Wywołanie akcji rycerza z dodatkową umiejętnością
    }
}
