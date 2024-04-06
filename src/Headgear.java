import java.awt.*;

public class Headgear {
    private final Color color;

    public Headgear(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public static Headgear generateRandomHeadgear() {
        int headgearCount = 2;
        int r = (int) (Math.random() * headgearCount);
        Headgear headgear;
        switch (r) {
            case 0: headgear = new Cap(Person.generateRandomColor(), Person.generateRandomBoolean());
            case 1: headgear = new Hat(Person.generateRandomColor());
            default: headgear = new Headgear(Person.generateRandomColor());
        }
        return headgear;
    }
}