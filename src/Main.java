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
    }

}
