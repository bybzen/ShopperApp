package shopperApplication.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class PurchaseOrder extends Items{
    private String purchaseNumber;
    private String time;

    public PurchaseOrder(int prize, String brand, String size, String type, String color, String purchaseNumber) {
        super(prize, brand, size, type, color);
        this.purchaseNumber = purchaseNumber;
        this.time = setTime();
    }

    public PurchaseOrder() {
        super(0, "-", "-", "-", "-");
    }

    public String setTime() {
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();
        time = formatTime.format(current);
        return time;
    }
}


