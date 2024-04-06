import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class Person<T extends TopClothing, S extends BottomClothing, Y extends Headgear> {
    private final char gender; //m, f, d
    private final Hair hair;
    private final T topClothing;
    private final S bottomClothing;
    private final Y headgear;

    public Person(char gender, Hair hair, T topClothing, S bottomClothing, Y headgear) {
        this.gender = gender;
        this.hair = hair;
        this.topClothing = topClothing;
        this.bottomClothing = bottomClothing;
        this.headgear = headgear;
    }


    public char getGender() {
        return gender;
    }

    public Hair getHair() {
        return hair;
    }

    public TopClothing getTopClothing() {
        return topClothing;
    }

    public BottomClothing getBottomClothing() {
        return bottomClothing;
    }

    public Headgear getHeadgear() {
        return headgear;
    }

    public boolean comparePerson(Person anotherP) { //Update with nem Types
        return compareGender(anotherP) && compareHair(anotherP) && compareTopClothing(anotherP) && compareBottomClothing(anotherP) && compareHeadgear(anotherP);
    }

    public boolean compareGender(Person anotherP) {
        return getGender() == anotherP.getGender(); //could use Variables directly
    }

    public boolean compareHair(Person anotherP) {
        return getHair().getColor() == anotherP.getHair().getColor() && getHair().getLength().equals(anotherP.getHair().getLength()) && getHair().getStyle().equals(anotherP.getHair().getStyle());
    }

    public boolean compareTopClothing(Person anotherP) {
        return getTopClothing().getColor() == anotherP.getTopClothing().getColor(); // check TopClothing Type
    }
    public boolean compareBottomClothing(Person anotherP) {
        boolean equal;
        equal = getBottomClothing().getColor() == anotherP.getBottomClothing().getColor();
        // check Bottom Type
        // check for type specific properties
        equal = equal && true;
        return equal;
    }
    public boolean compareHeadgear(Person anotherP) {
        return getHeadgear().getColor() == anotherP.getHeadgear().getColor(); // check Headgear Type
    }


    private static Person generateRandomPerson() { //Update with nem Types
        //randomize inPut
        return new Person(generateRandomGender(), Hair.generateRandomHair(), TopClothing.generateRandomTopClothing(), BottomClothing.generateRandomBottomClothing(), Headgear.generateRandomHeadgear());
    }

    public static Person generateRandomPerson(ArrayList<Person> excludedPersons) {
        Person newP;
        boolean equal = false;
        do {
            newP = generateRandomPerson();
            for (Person p: excludedPersons) {
                if (newP.comparePerson(p)) {
                    equal = true;
                    break;
                }
            }
        } while (!equal);
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