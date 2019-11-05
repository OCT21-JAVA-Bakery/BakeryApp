import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PopulateDatabase {
    private BakeryDatabase bakerydb;

    public PopulateDatabase(BakeryDatabase bakerydb) {
        this.bakerydb = bakerydb;
    }

    public PopulateDatabase() {
    }

    public BakeryDatabase getBakerydb() {
        return bakerydb;
    }

    public void setBakerydb(BakeryDatabase bakerydb) {
        this.bakerydb = bakerydb;
    }

    public void addItems(){
        if(bakerydb == null)
        {
            return;//return nothing if null
        }
        else
        {

            BakeryItems item1 = new BakeryItems();
            ArrayList<String> diet1 = new ArrayList<>();
            item1.setName("Banana Bread");
            item1.setPrice(5.95);
            item1.setExpDate("11/20/2019");
            diet1.add("Free of gluten");
            diet1.add("Free of diary");
            diet1.add("Free of eggs");
            diet1.add("Free of soy");
            diet1.add("Free of tree nuts");
            diet1.add("Free of sesame");
            item1.setDietRestriction(diet1);
            item1.setNumInStock(10);
            bakerydb.add(item1);

            BakeryItems item2 = new BakeryItems();
            item2.setName("Multi-grain White Bread");
            item2.setPrice(10.95);
            item2.setExpDate("11/22/2019");
            item2.setDietRestriction(new ArrayList<String>(
                    Arrays.asList(
                            "Free of gluten" ,
                            "Free of diary",
                            "Free of eggs",
                            "Free of soy" ,
                            "Free of tree nuts",
                            "Free of sesame")
                    )
            );
            item2.setNumInStock(10);
            bakerydb.add(item2);

            BakeryItems item3 = new BakeryItems();
            item3.setName("Large Hamburger Buns");
            item3.setPrice(5.00);
            item3.setExpDate("11/19/2019");
            Collections.addAll(  item3.getDietRestriction() ,
                                    "Free of gluten" ,
                                    "Free of diary",
                                    "Free of eggs",
                                    "Free of soy" ,
                                    "Free of tree nuts",
                                    "Free of sesame");
            item3.setNumInStock(10);
            bakerydb.add(item3);

        }
    }
}
