import Product.Category;
import Product.Product;
import Users.Admin;
import Users.Customer;
import Users.User;

import java.util.*;

public class DepartmentStore {
    private ArrayList<Category> listOfCategories;
    private ArrayList<Order> listOfCustOrders;
    private ArrayList<User> listOfUsers;
    private ArrayList<Product> catalog;

    public void createUser(String type, String email, String password, String displayName) {
        for (User u : listOfUsers){
            try {
                if (u.getEmail().equalsIgnoreCase(email))
                    throw new Exception();
                listOfUsers.add(new Customer(email, password, displayName));
            } catch (Exception e){ System.out.println("Invalid email already exists."); }
        }
    }

    public void loginUser(String email, String password){
        for (User u : listOfUsers){
            try {
                if (u.getEmail().equalsIgnoreCase(email)){
                    if (u.getPassword().equals(password)){
                        // THIS IS THE PART WHERE WE NEED TO CONNECT TO THE SERVER
                    }
                }
                else
                    throw new Exception();
            } catch (Exception e){ System.out.println("Error: Invalid email or password."); }
        }
    }

    public void addProduct(){
        /*
        public Product(String productID, String productName, String brandName, String productDesc,
                   LocalDate dateOfIncorp, ArrayList<Category> prodCategory) {
        this.productID = productID;
        this.productName = productName;
        this.brandName = brandName;
        this.productDesc = productDesc;
        this.dateOfIncorp = dateOfIncorp;
        this.prodCategory = prodCategory;
         */
        // WHEN IN APPLICATION - ADMIN CHOOSES ELECTRONIC - SERIAL NOS - UPDATE TAB

    }
}