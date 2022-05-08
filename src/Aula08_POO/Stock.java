package Aula08_POO;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private int stockId;
    public String name;
    private List<Product> products = new ArrayList<Product>();
    private static int counter;

    public Stock(String name){
        counter++;
        this.stockId = counter;
        this.name = name;
    }

    public int getStockId() {
        return stockId;
    }

    public void listProducts(){
        for (Product p : products){
            System.out.println(p.toString());
        }
    }

    public void readProduct(int productId){
        for (Product p : products) {
            if (p.getProductId() == productId){
                System.out.println(p.toString());
            }
        }
    }

    public void setProdutos(List<Product> products){
        this.products = products;
    }

    public void addProduct(Product product){
        for (Product p : products) {
            if ((p.name == product.name) && (p.brand == product.brand)) {
                p.quantity += product.quantity;
                return;
            }
        }
        this.products.add(product);
    }

    public void removeProduct(int productId){
        for (Product p : products) {
            if (p.getProductId() == productId){
                this.products.remove(p);
                return;
            }
        }
        System.out.println("Produto não localizado");

    }

    public void updateProduct(int productId, String name, String aisle, String kind, int quantity, String brand){
        for(Product p : products){
            if (p.getProductId() == productId){
                p.name = name;
                p.aisle = aisle;
                p.kind = kind;
                p.quantity = quantity;
                p.brand = brand;
            }
        }
    }
}
