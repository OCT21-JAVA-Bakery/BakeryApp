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

    public BakeryDatabase searchDietRestriction(String dietRestriction) {
        BakeryDatabase returnResult = new BakeryDatabase();
        if (bakeryDatabase == null) // if not set berkeryDatabase yet
            return returnResult;



        for (BakeryItems bakeryItems : bakeryDatabase) {

            for (String eachDietRestriction : bakeryItems.getDietRestriction()) {
                if (dietRestriction.equalsIgnoreCase(eachDietRestriction)) {
                    returnResult.add(bakeryItems);
                    break;
                }

            }
        }

        return returnResult;
    }
}
