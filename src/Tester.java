public class Tester {

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
        String toSearch = searchDatabase.userInput("Diet restriction > ");
        BakeryDatabase db2 = searchDatabase.searchDietRestriction(toSearch);

        System.out.println(db2);

    }
}
