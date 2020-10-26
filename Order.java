
import java.util.Random;

public class Order{
    private String orderID;

    public Order(String orderID){
        this.orderID = orderID;
    }

    public Order() {

    }

    //creates an ordernumber
    public String createOrderNumber(){
        Random random = new Random();
        this.orderID = "O#" + String.format(String.valueOf(random.nextInt()));
        return this.orderID;
    }

    public String newCustomerOrder(){

    }


}