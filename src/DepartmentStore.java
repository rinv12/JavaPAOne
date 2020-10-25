import java.util.*;

public class DepartmentStore {
    private ArrayList<Product> listOfCategories;
    private ArrayList<Order> listOfCustOrders;
    private ArrayList<User> listOfUsers;

    public void createUser(String type, String email, String password, String displayName) {
        if(type.equalsIgnoreCase("Admin") || type.equalsIgnoreCase("Administrator"))
            listOfUsers.add(new Admin(email, password, displayName));
        else if(type.equalsIgnoreCase("Customer"))
            listOfUsers.add(new Customer(email, password, displayName));
        else
            System.out.println("Invalid user type.");
    }
}