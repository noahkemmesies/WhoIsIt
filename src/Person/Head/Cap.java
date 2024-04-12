package Person.Head;

import java.awt.*;

public class Cap extends Headgear {

    private final boolean backwards;

    public Cap(Color color, boolean backwards) {
        super(color);
        this.backwards = backwards;
    }
}