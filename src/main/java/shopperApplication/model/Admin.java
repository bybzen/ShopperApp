package shopperApplication.model;

import java.util.HashMap;

public class Admin extends User{

    private HashMap<String, Customer> customerMap;

    public Admin(String username, String password) {
        super(username, password);
        customerMap = null;
    }

    public PurchaseOrder viewPurchaseOrder (HashMap<String, Customer> cusMap, Customer target) {
        for (Customer cus : cusMap.values()){
            if (target.equals(cus)){
                return cus.getPurchaseOrder();
            }
        }
        return null;
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }
}
