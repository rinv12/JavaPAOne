import java.time.LocalDate;

public class Cellphone extends Electronic {
    private String imei;
    private String os;

    public Cellphone(String productID, String productName, String brandName, String productDesc,
                     LocalDate dateOfIncorp, String serialNum, LocalDate warrantyPer, String imei, String os) {
        super(productID, productName, brandName, productDesc, dateOfIncorp, serialNum, warrantyPer);
        this.imei = imei;
        this.os = os;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

}