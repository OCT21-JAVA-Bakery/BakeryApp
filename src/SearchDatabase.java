import java.util.Scanner;

public class SearchDatabase {

    private BakeryDatabase bakeryDatabase;

    public SearchDatabase() {
    }

    public SearchDatabase(BakeryDatabase bakeryDatabase) {
        this.bakeryDatabase = bakeryDatabase;
    }

    public BakeryDatabase getBakeryDatabase() {
        return bakeryDatabase;
    }

    public void setBakeryDatabase(BakeryDatabase bakeryDatabase) {
        this.bakeryDatabase = bakeryDatabase;
    }

    public String userInput(String prompt) {

        System.out.print(prompt);

//        Scanner kb = new Scanner(System.in);
//
//        String returnValue = kb.nextLine();
//
//        return returnValue;

        return (new Scanner(System.in)).nextLine();
    }

    public BakeryDatabase searchDietRestriction(String dietRestriction) {

        BakeryDatabase returnResult = new BakeryDatabase();

        if (bakeryDatabase == null) // if not set berkeryDatabase yet
            return returnResult;



        for (BakeryItems bakeryItems : bakeryDatabase) {
            inner:
            for (String eachDietRestriction : bakeryItems.getDietRestriction()) {


                if (eachDietRestriction.equalsIgnoreCase(dietRestriction) ||
                        eachDietRestriction.equalsIgnoreCase("free of "+dietRestriction)
                ) {
                    returnResult.add(bakeryItems);
                    break inner;
                }

            }
        }

        return returnResult;
    }
}
