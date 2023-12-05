//Damian Pawlik 109484
/*Jest to wzorzec projektowy, który definiuje interfejs do tworzenia obiektów, ale pozostawia konkretne implementacje tworzenia tych obiektów klasom pochodnym.
Daje to możliwość tworzenia obiektów, nie precyzując ich konkretnych klas w kodzie, co umożliwia elastyczność w zakresie tworzenia obiektów zależnie od potrzeb użytkownika.*/
// Abstrakcyjna klasa postaci
interface Character {
    void attack();
}

// Klasy postaci w różnych typach
class Mage implements Character {
    @Override
    public void attack() {
        System.out.println("Mage casts a spell!");
    }
}

class Warrior implements Character {
    @Override
    public void attack() {
        System.out.println("Warrior swings a sword!");
    }
}

class Archer implements Character {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}

// Abstrakcyjna klasa fabryki postaci
interface CharacterFactory {
    Character createCharacter();
}

// Implementacje fabryk postaci dla różnych typów
class WaterCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Mage(); // Tworzenie postaci typu Mage dla wody
    }
}

class FireCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior(); // Tworzenie postaci typu Warrior dla ognia
    }
}

class AirCharacterFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Archer(); // Tworzenie postaci typu Archer dla powietrza
    }
}

public class Main {
    public static void main(String[] args) {
        // Utworzenie fabryki postaci związanej z wodą
        CharacterFactory waterFactory = new WaterCharacterFactory();
        // Utworzenie fabryki postaci związanej z ogniem
        CharacterFactory fireFactory = new FireCharacterFactory();
        // Tworzenie postaci
        Character waterCharacter = waterFactory.createCharacter();
        Character fireCharacter = fireFactory.createCharacter();

        // Wywołanie metody dla konkretnej postaci
        waterCharacter.attack(); // Wyświetli: "Mage casts a spell!"
        fireCharacter.attack(); // Wyświetli: "Warrior casts a spell!"
    }
}
