package Person.Head;

import Person.Person;

import java.awt.*;

public class Hair {

    private final Color color;
    private final String length; //1, 2, 3, 4
    private final String style;

    public Hair(Color color, String length, String style) {
        this.color = color;
        this.length = length;
        this.style = style;
    }

    public Color getColor() {
        return color;
    }

    public String getLength() {
        return length;
    }

    public String getStyle() {
        return style;
    }

    public boolean compareTo(Hair anotherH) {
        return getColor() == anotherH.getColor() && getLength().equals(anotherH.getLength()) && getStyle().equals(anotherH.getStyle());
    }


    public static Hair generateRandomHair() {
        String[] lengths = {"long", "middle", "short"};
        int r = (int) (Math.random() * lengths.length);

        String[] types = {"Afro", "Sided", "Pony", "Dutt"};
        int r1 = (int) (Math.random() * types.length);

        return new Hair(Person.generateRandomColor(new Color[]{Color.BLACK, Color.DARK_GRAY, Color.GRAY}), lengths[r], types[r1]);
    }
}