package Aula08_POO;


public class Product {

    private int productId;
    private String name;
    private String aisle;
    private String kind;
    private int quantity;
    private String brand;
    private static int counter;

    public Product(){
        counter++;
        this.productId = counter;
    }

    public Product(String name, String aisle, String kind, int quantity, String brand) {
        counter++;
        this.productId = counter;
        this.name = name;
        this.aisle = aisle;
        this.kind = kind;
        this.quantity = quantity;
        this.brand = brand;
    }
    public int getProductId(){
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{ " +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", aisle='" + aisle + '\'' +
                ", kind='" + kind + '\'' +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                '}';
    }
}
