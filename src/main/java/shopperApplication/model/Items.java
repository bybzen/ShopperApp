package shopperApplication.model;

public class Items {

    private int prize;
    private String brand;
    private String size;
    private String type;
    private String color;

    public Items(int prize, String brand, String size, String type, String color) {
        this.prize = prize;
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.color = color;
    }

    public int getPrize() {
        return prize;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
