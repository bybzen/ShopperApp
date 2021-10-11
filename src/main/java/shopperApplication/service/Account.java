package shopperApplication.service;

import shopperApplication.model.Customer;
import shopperApplication.model.User;

import java.util.HashMap;

public class Account {
    private HashMap<String, Customer> customerMap = new HashMap<>();

    public Account () {
        customerMap = null;
    }

    public boolean createCustomer (String username, String password, String address, String firstname, String lastname){
        boolean check = false;
        for (Customer cus : customerMap.values()) {
            if (cus.getUsername().equals(username)) {
                check = true;
                break;
            }
        }
        if (!check){
            Customer cus = new Customer(username, password, address, firstname, lastname);
            customerMap.put(username, cus);
        }
        return check; // true = สร้างสำเร็จ
    }
}
