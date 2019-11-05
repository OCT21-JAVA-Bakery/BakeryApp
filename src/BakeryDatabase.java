import java.util.ArrayList;
import java.util.Collection;

public class BakeryDatabase extends ArrayList<BakeryItems> {
    public BakeryDatabase(int initialCapacity) {
        super(initialCapacity);
    }

    public BakeryDatabase() {
    }

    public BakeryDatabase(Collection<? extends BakeryItems> c) {
        super(c);
    }

    public void displayText() {
        // this refer to itself
        System.out.print(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (BakeryItems bakeryItems : this) {
            sb.append(bakeryItems);
            sb.append("\n");

        }

        return sb.toString();
    }
}
