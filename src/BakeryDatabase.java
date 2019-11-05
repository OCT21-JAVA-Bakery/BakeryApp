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
}
