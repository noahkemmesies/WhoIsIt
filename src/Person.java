import java.awt.*;
import java.util.ArrayList;

public class Person {
    private final char gender; //m, f, d
    private final Oberteil oberteil;
    private final Kopfbedeckung kopfbedeckung;

    public Person(char gender, Oberteil oberteil, Kopfbedeckung kopfbedeckung) {
        this.gender = gender;
        this.oberteil = oberteil;
        this.kopfbedeckung = kopfbedeckung;
    }


    public char getGender() {
        return gender;
    }

    public Oberteil getOberteil() {
        return oberteil;
    }

    public Kopfbedeckung getKopfbedeckung() {
        return kopfbedeckung;
    }

    public boolean equalPerson(Person anotherP) {
        return getGender() == anotherP.getGender() && getOberteil().getColor() == anotherP.getOberteil().getColor() && getKopfbedeckung().getTyp().equals(anotherP.getKopfbedeckung().getTyp());
    }

    public static Person generateRandomPerson() {
        //randomize inPut
        return new Person('m', new Oberteil(Color.BLACK), null);
    }

    public static Person generateRandomPerson(ArrayList<Person> excludedPersons) {
        Person newP;
        boolean equal = false;
        do {
            newP = generateRandomPerson();
            for (Person p: excludedPersons) {
                if (newP.equalPerson(p)) {
                    equal = true;
                    break;
                }
            }
        } while (!equal);
        return newP;
    }
}