//Damian Pawlik 109484
/*Jest to wzorzec projektowy, który umożliwia tworzenie rodzin powiązanych ze sobą obiektów bez konieczności określania ich konkretnych klas.
Opiera się na tworzeniu hierarchii fabryk, gdzie każda fabryka produkująca obiekty danego rodzaju jest grupowana w jedną abstrakcyjną fabrykę.
Wzorzec ten pozwala na tworzenie obiektów zgodnych z daną rodziną, ale nie wymaga precyzyjnego określania klas konkretnych obiektów.*/
// Abstrakcyjna fabryka
interface CharacterFactory {
    Mage createMage();
    Warrior createWarrior();
    Archer createArcher();
}

// Konkretne fabryki implementujące abstrakcyjną fabrykę
class WaterCharacterFactory implements CharacterFactory {
    @Override
    public Mage createMage() {
        return new WaterMage();
    }

    @Override
    public Warrior createWarrior() {
        return new WaterWarrior();
    }

    @Override
    public Archer createArcher() {
        return new WaterArcher();
    }
}

class FireCharacterFactory implements CharacterFactory {
    @Override
    public Mage createMage() {
        return new FireMage();
    }

    @Override
    public Warrior createWarrior() {
        return new FireWarrior();
    }

    @Override
    public Archer createArcher() {
        return new FireArcher();
    }
}

class AirCharacterFactory implements CharacterFactory {
    @Override
    public Mage createMage() {
        return new AirMage();
    }

    @Override
    public Warrior createWarrior() {
        return new AirWarrior();
    }

    @Override
    public Archer createArcher() {
        return new AirArcher();
    }
}

class EarthCharacterFactory implements CharacterFactory {
    @Override
    public Mage createMage(){
        return new EarthMage();
    }
    @Override
    public Warrior createWarrior(){
        return new EarthWarrior();
    }
    @Override
    public Archer createArcher(){
        return new EarthArcher();
    }
}
// Abstrakcyjne klasy postaci
interface Mage {
    void castSpell();
}

interface Warrior {
    void attack();
}

interface Archer {
    void shoot();
}

// Implementacje konkretnych klas postaci z różnymi typami
class WaterMage implements Mage {
    @Override
    public void castSpell() {
        System.out.println("Water Mage casts water spell.");
    }
}

class WaterWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Water Warrior attacks with water sword.");
    }
}

class WaterArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Water Archer shoots water arrows.");
    }
}

// Implementacje konkretnych klas postaci dla typu Ognia
class FireMage implements Mage {
    @Override
    public void castSpell() {
        System.out.println("Fire Mage casts fire spell.");
    }
}

class FireWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Fire Warrior attacks with fire sword.");
    }
}

class FireArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Fire Archer shoots fire arrows.");
    }
}

// Implementacje konkretnych klas postaci dla typu Powietrza
class AirMage implements Mage {
    @Override
    public void castSpell() {
        System.out.println("Air Mage casts air spell.");
    }
}

class AirWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Air Warrior attacks with air sword.");
    }
}

class AirArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Air Archer shoots air arrows.");
    }
}

class EarthMage implements Mage {
    @Override
    public void castSpell() {
        System.out.println("Earth Mage casts earth spell.");
    }
}

class EarthWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("Earth Warrior attacks with earth sword.");
    }
}

class EarthArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Earth Archer shoots earth arrows.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Utworzenie fabryki postaci związanej z wodą
        CharacterFactory factory = new FireCharacterFactory(); // można szybko przełączyć
        CharacterFactory factory2 = new WaterCharacterFactory(); // można szybko przełączyć

        // Tworzenie postaci
        // nie przejmujemy się co to za factory, ważne że ma dać taki sam produkt, ogień lub wodę.
        Mage mage = factory.createMage();
        Warrior warrior = factory.createWarrior();
        Archer archer = factory.createArcher();

        // Wywołanie metod konkretnej postaci
        mage.castSpell();
        warrior.attack();
        archer.shoot();
    }
}
