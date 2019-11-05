public class Main {
    public static void main(String[] args) {

        BakeryDatabase bakerydb = new BakeryDatabase();

        PopulateDatabase populateDatabase = new PopulateDatabase();
        populateDatabase.setBakerydb(bakerydb);
        populateDatabase.addItems();//call addItem method from PopulateDatabase

        SearchDatabase searchDatabase = new SearchDatabase();
        searchDatabase.setBakeryDatabase(bakerydb);//call searchDB method from SearchDatabase


        System.out.println("Welcome to the Brookley's Better Bakery App! \n" +
                "We contain peanut, gluten, soy and dairy in our products. \n");

        String toSearch;

        outer:
        do {
            toSearch = searchDatabase.userInput("To search for foods that you can eat, please enter the name of the diet restriction:\n"+
            "To see a list of all our foods, please type \"all\". > ");

            if(toSearch.equalsIgnoreCase("all"))
            {
                System.out.println(bakerydb);
            }
            else {
                BakeryDatabase db2 = searchDatabase.searchDietRestriction(toSearch);
                System.out.println(db2);
            }
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
