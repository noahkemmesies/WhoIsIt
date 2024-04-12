package Person;

import Person.Head.*;
import Person.TopClothing.*;
import Person.BottomClothing.*;

import java.awt.*;
import java.util.ArrayList;

public class Person<T extends TopClothing, S extends BottomClothing> {
    private final char gender; //m, f, d
    private final Head head;
    private final T topClothing;
    private final S bottomClothing;

    public Person(char gender, Head head, T topClothing, S bottomClothing) {
        this.gender = gender;
        this.head = head;
        this.topClothing = topClothing;
        this.bottomClothing = bottomClothing;
    }


    public char getGender() {
        return gender;
    }

    public Head getHead() {
        return head;
    }

    public TopClothing getTopClothing() {
        return topClothing;
    }

    public BottomClothing getBottomClothing() {
        return bottomClothing;
    }

    public boolean compareTo(Person anotherP) { //Update with nem Types
        return compareGender(anotherP) && compareHead(anotherP) && compareTopClothing(anotherP) && compareBottomClothing(anotherP);
    }

    public boolean compareGender(Person anotherP) {
        return getGender() == anotherP.getGender(); //could use Variables directly
    }

    public boolean compareHead(Person anotherP) {
        return getHead().compareTo(anotherP.getHead());
    }

    public boolean compareTopClothing(Person anotherP) {
        return getTopClothing().getColor() == anotherP.getTopClothing().getColor(); // check Person.TopClothing.TopClothing Type
    }

    public boolean compareBottomClothing(Person anotherP) {
        boolean equal;
        equal = getBottomClothing().getColor() == anotherP.getBottomClothing().getColor();
        // check Bottom Type
        // check for type specific properties
        equal = equal && true;
        return equal;
    }


    private static Person generateRandomPerson() { //Update with nem Types
        //randomize inPut
        return new Person(generateRandomGender(), Head.generateRandomHead(), TopClothing.generateRandomTopClothing(), BottomClothing.generateRandomBottomClothing());
    }

    public static Person generateRandomPerson(ArrayList<Person> excludedPersons) {
        Person newP;
        boolean equal;
        do {
            equal = false;
            newP = generateRandomPerson();
            for (Person p: excludedPersons) {
                if (newP.compareTo(p)) {
                    equal = true;
                    break;
                }
            }
        } while (equal);
        return newP;
    }

    public static char generateRandomGender() {
        char[] chars = {'m', 'f', 'd'};
        int r = (int) (Math.random() * chars.length);
        return chars[r];
    }

    public static Color generateRandomColor() {
        Color[] colors = {Color.BLACK, Color.WHITE, Color.BLUE, Color.GREEN, Color.RED, Color.ORANGE, Color.YELLOW};
        int r = (int) (Math.random() * colors.length);
        return colors[r];
    }

    public static Color generateRandomColor(Color[] colors) {
        int r = (int) (Math.random() * colors.length);
        return colors[r];
    }

    public static boolean generateRandomBoolean() {
        return (int) (Math.random() * 2) == 0;
    }
}