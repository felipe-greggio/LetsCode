package Aula08_POO;


public class Product {

    private int productId;
    String name;
    String aisle;
    String kind;
    int quantity;
    String brand;
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
