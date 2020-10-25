import java.time.LocalDate;

public class Electronic extends Product {
    private String serialNum;
    private LocalDate warrantyPer;

    public Electronic(String productID, String productName, String brandName, String productDesc,
                      LocalDate dateOfIncorp, String serialNum, LocalDate warrantyPer) {
        super(productID, productName, brandName, productDesc, dateOfIncorp);
        this.serialNum = serialNum;
        this.warrantyPer = warrantyPer;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public LocalDate getWarrantyPer() {
        return warrantyPer;
    }

    public void setWarrantyPer(LocalDate warrantyPer) {
        this.warrantyPer = warrantyPer;
    }
}
