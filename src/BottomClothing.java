import java.awt.*;

public class BottomClothing {

    private final Color color;

    public BottomClothing(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return color;
    }

    public static BottomClothing generateRandomBottomClothing() {
        int bottomClothesCount = 2;
        int r = (int) (Math.random() * bottomClothesCount);
        BottomClothing bottomClothing;
        switch (r) {
            case 0: bottomClothing = new Jeans(Person.generateRandomColor());
            case 1: bottomClothing = new Skirt(Person.generateRandomColor());
            default: bottomClothing = new BottomClothing(Person.generateRandomColor());
        }
        return bottomClothing;
    }
}