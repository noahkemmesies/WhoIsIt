import java.awt.*;

public class TopClothing {
    private final Color color;

    public TopClothing(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public static TopClothing generateRandomTopClothing() {
        int topClothesCount = 2;
        int r = (int) (Math.random() * topClothesCount);
        TopClothing topClothing;
        switch (r) {
            case 0: topClothing = new TShirt(Person.generateRandomColor(), Person.generateRandomBoolean());
            case 1: topClothing = new Top(Person.generateRandomColor());
            default: topClothing = new TopClothing(Person.generateRandomColor());
        }
        return topClothing;
    }
}