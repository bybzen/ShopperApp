package shopperApplication.model;

public class Customer extends User {

    private String address;
    private String firstname;
    private String lastname;
    //private PurchaseOrder purchaseOrder;

    public Customer(String username, String password, String address, String firstname, String lastname) {
        super(username, password);
        this.address = address;
        this.firstname = firstname;
        this.lastname = lastname;
        //this.purchaseOrder = new PurchaseOrder();
    }

    public String getAddress() {
        return address;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

//    public PurchaseOrder getPurchaseOrder() {
//        return purchaseOrder;
//    }
}
