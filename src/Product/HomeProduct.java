package Product;

import java.time.LocalDate;
import java.util.ArrayList;

public class HomeProduct extends Product {
    private String intendedLoc;

    public HomeProduct(String productID, String productName, String brandName, String productDesc,
                       LocalDate dateOfIncorp, ArrayList<Category> prodCategory, String intendedLoc) {
        super(productID, productName, brandName, productDesc, dateOfIncorp, prodCategory);
        this.intendedLoc = intendedLoc;
    }

    public String getIntendedLoc() {
        return intendedLoc;
    }

    public void setIntendedLoc(String intendedLoc) {
        this.intendedLoc = intendedLoc;
    }
}