import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

    public void setExpDate(String expDateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        // Date expDate = (new SimpleDateFormat("dd/MM/yyyy")).parse(expDateString);

        Date expDate = null;
        try {//if this shows error
            expDate = simpleDateFormat.parse(expDateString);
            this.expDate = expDate;
        } catch (ParseException e) { //correct the date
            this.expDate = Calendar.getInstance().getTime();
        }


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

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

        return
                "\nName:            " + name + '\n' +
                "Price:             " + price +'\n' +
                "Expiration Date:   " + simpleDateFormat.format(expDate)+'\n' +
                "Diet Restriction:  " + dietRestriction +'\n' +
                "Quantity in Stock: " + numInStock
                ;
    }
}
