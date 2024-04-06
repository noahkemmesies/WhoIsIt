import java.awt.*;

public class TShirt extends TopClothing {

    private final boolean longSleeve;

    public TShirt(Color color, boolean longSleeve) {
        super(color);
        this.longSleeve = longSleeve;
    }


    public boolean getLongSleeve() {
        return longSleeve;
    }
}