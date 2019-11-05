public class Main {
    public static void main(String[] args) {

        BakeryDatabase bakerydb = new BakeryDatabase();
        System.out.println("Empty");
        System.out.println(bakerydb);

        PopulateDatabase populateDatabase = new PopulateDatabase();

        populateDatabase.setBakerydb(bakerydb);

        populateDatabase.addItems();

        System.out.println("Populated");
        System.out.println(bakerydb);


        SearchDatabase searchDatabase = new SearchDatabase();
        searchDatabase.setBakeryDatabase(bakerydb);
        String toSearch;

        outer:
        do {
            toSearch = searchDatabase.userInput("Diet restriction > ");
            BakeryDatabase db2 = searchDatabase.searchDietRestriction(toSearch);
            System.out.println(db2);
           // boolean validInput = false;
            do {
                String yesno;
                yesno = searchDatabase.userInput("Do you want to continue? (Yes/No)");
                if (yesno.equalsIgnoreCase("yes")) {
                   // validInput = true;
                    continue outer;
                } else if (yesno.equalsIgnoreCase("no")) {

                    //validInput = true;
                    break outer;
                } else {
                    System.out.println("Please answer yes or no");
                }


            }while(true);  //(!validInput);
        }
        while(true); // outer
        System.out.println("Goodbye!");
    }

}
