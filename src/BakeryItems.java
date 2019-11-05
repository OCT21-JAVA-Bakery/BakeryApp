import java.util.ArrayList;
import java.util.Date;

public class BakeryItems {
    private String name;
    private double price;
    private Date expDate;
    private ArrayList<String> dietRestriction = new ArrayList<>();
    private int numInStock;

    public BakeryItems() {
    }

    public BakeryItems(String name, double price, Date expDate, ArrayList<String> dietRestriction, int numInStock) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.dietRestriction = dietRestriction;
        this.numInStock = numInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public ArrayList<String> getDietRestriction() {
        return dietRestriction;
    }

    public void setDietRestriction(ArrayList<String> dietRestriction) {
        this.dietRestriction = dietRestriction;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }
}
