import Product.Category;
import Users.Admin;
import Users.Customer;
import Users.User;

import java.util.*;

public class DepartmentStore {
    private ArrayList<Category> listOfCategories;
    private ArrayList<Order> listOfCustOrders;
    private ArrayList<User> listOfUsers;

    public void createUser(String type, String email, String password, String displayName) {
        if(type.equalsIgnoreCase("Users.Admin") || type.equalsIgnoreCase("Administrator"))
            listOfUsers.add(new Admin(email, password, displayName));
        else if(type.equalsIgnoreCase("Users.Customer"))
            listOfUsers.add(new Customer(email, password, displayName));
        else
            System.out.println("Invalid user type.");
    }
}