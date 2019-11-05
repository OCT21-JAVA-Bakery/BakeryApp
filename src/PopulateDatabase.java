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
                            "Free of diary",
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
                                    "Free of diary",
                                    "Free of eggs",
                                    "Free of tree nuts",
                                    "Free of sesame");
            item3.setNumInStock(10);
            bakerydb.add(item3);

            BakeryItems item4 = new BakeryItems();
            item4.setName("Cinnamon Bread");
            item4.setPrice(10.95);
            item4.setExpDate("11/25/2019");
            Collections.addAll(  item4.getDietRestriction() ,
                    "Free of gluten" ,
                    "Free of diary",
                    "Free of soy" ,
                    "Free of sesame");
            item3.setNumInStock(10);
            bakerydb.add(item4);

            BakeryItems item5 = new BakeryItems();
            item5.setName("Cinnamon Raisin Bread");
            item5.setPrice(10.95);
            item5.setExpDate("11/12/2019");
            Collections.addAll(item5.getDietRestriction(),
                    "Free of diary",
                    "Free of eggs",
                    "Free of soy" ,
                    "Free of tree nuts",
                    "Free of sesame");
            item5.setNumInStock(10);
            bakerydb.add(item5);

            BakeryItems item6 = new BakeryItems();
            item6.setName("Soft Pizza Crust");
            item6.setPrice(6.95);
            item6.setExpDate("11/20/2019");
            Collections.addAll(  item6.getDietRestriction() ,
                    "Free of gluten" ,
                    "Free of diary",
                    "Free of eggs",
                    "Free of tree nuts");
            item6.setNumInStock(10);
            bakerydb.add(item6);

            BakeryItems item7 = new BakeryItems();
            item7.setName("Gluten Free Dinner Rolls");
            item7.setPrice(3.00);
            item7.setExpDate("11/15/2019");
            Collections.addAll(  item7.getDietRestriction() ,
                    "Free of gluten" ,
                    "Free of eggs",
                    "Free of soy" ,
                    "Free of tree nuts",
                    "Free of sesame");
            item7.setNumInStock(10);
            bakerydb.add(item7);

            BakeryItems item8 = new BakeryItems();
            item8.setName("Savory Rolls");
            item8.setPrice(3.00);
            item8.setExpDate("11/16/2019");
            Collections.addAll(  item8.getDietRestriction() ,
                    "Free of gluten" ,
                    "Free of diary",
                    "Free of eggs",
                    "Free of tree nuts" );
            item8.setNumInStock(10);
            bakerydb.add(item8);
        }
    }
}
