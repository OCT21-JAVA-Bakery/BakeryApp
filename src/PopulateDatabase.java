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
            item4.setNumInStock(10);
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

            BakeryItems item9 = new BakeryItems();
            item9.setName("BBQ Chicken Dozen Savory Empandas");
            item9.setPrice(39.00);
            item9.setExpDate("11/20/2019");
            Collections.addAll(  item9.getDietRestriction() ,
                    "Free of gluten" ,
                    "Free of diary");
            item9.setNumInStock(10);
            bakerydb.add(item9);

            BakeryItems item10 = new BakeryItems();
            item10.setName("Bread Pudding");
            item10.setPrice(4.50);
            item10.setExpDate("11/25/2019");
            Collections.addAll(  item10.getDietRestriction() ,
                    "Free of diary" ,
                    "Free of eggs",
                    "Free of tree nuts" );
            item10.setNumInStock(10);
            bakerydb.add(item10);

            BakeryItems item11 = new BakeryItems();
            item11.setName("Cinnamon Raisin Bread");
            item11.setPrice(10.95);
            item11.setExpDate("11/12/2019");
            Collections.addAll(item11.getDietRestriction(),
                    "Free of diary",
                    "Free of eggs",
                    "Free of tree nuts",
                    "Free of sesame");
            item11.setNumInStock(10);
            bakerydb.add(item11);

            BakeryItems item12 = new BakeryItems();
            item12.setName("6-Pack of Muffins");
            item12.setPrice(16.50);
            item12.setExpDate("11/12/2019");
            Collections.addAll(item12.getDietRestriction(),
                    "Free of diary",
                    "Free of eggs",
                    "Free of soy" ,
                    "Free of tree nuts");
            item12.setNumInStock(10);
            bakerydb.add(item12);

            BakeryItems item13 = new BakeryItems();
            item13.setName("Dozen of Donuts");
            item13.setPrice(6.50);
            item13.setExpDate("11/15/2019");
            Collections.addAll(item13.getDietRestriction(),
                    "Free of diary",
                    "Free of eggs",
                    "Free of soy" ,
                    "Free of tree nuts",
                    "Free of sesame");
            item13.setNumInStock(10);
            bakerydb.add(item13);

            BakeryItems item14 = new BakeryItems();
            item14.setName("White Vanilla Bread");
            item14.setPrice(13.95);
            item14.setExpDate("11/15/2019");
            Collections.addAll(item14.getDietRestriction(),
                    "Free of diary",
                    "Free of eggs",
                    "Free of tree nuts",
                    "Free of sesame");
            item14.setNumInStock(10);
            bakerydb.add(item14);

            BakeryItems item15 = new BakeryItems();
            item15.setName("Black Bean Savory Rolls");
            item15.setPrice(8.95);
            item15.setExpDate("11/12/2019");
            Collections.addAll(item15.getDietRestriction(),
                    "Free of gluten",
                    "Free of eggs",
                    "Free of soy" ,
                    "Free of tree nuts",
                    "Free of sesame");
            item15.setNumInStock(10);
            bakerydb.add(item15);

        }
    }
}
