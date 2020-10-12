import java.time.LocalDate;
import java.util.*;

public class HomeProducts extends Products{
    private String intendedLoc;

    public HomeProducts(String productID, String productName, String brandName, String productDesc, LocalDate dateOfIncorp, String intendedLoc) {
        super(productID, productName, brandName, productDesc, dateOfIncorp);
        this.intendedLoc = intendedLoc;
    }

    public String getIntendedLoc() {
        return intendedLoc;
    }

    public void setIntendedLoc(String intendedLoc) {
        this.intendedLoc = intendedLoc;
    }
}