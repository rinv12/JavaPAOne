import java.time.LocalDate;

public abstract class Product {
    private String productID;
    private String productName;
    private String brandName;
    private String productDesc;
    private LocalDate dateOfIncorp;

    public Product(String productID, String productName, String brandName, String productDesc, LocalDate dateOfIncorp) {
        this.productID = productID;
        this.productName = productName;
        this.brandName = brandName;
        this.productDesc = productDesc;
        this.dateOfIncorp = dateOfIncorp;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public LocalDate getDateOfIncorp() {
        return dateOfIncorp;
    }

    public void setDateOfIncorp(LocalDate dateOfIncorp) {
        this.dateOfIncorp = dateOfIncorp;
    }
}
