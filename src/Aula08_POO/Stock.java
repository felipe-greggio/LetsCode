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
        if (products.isEmpty())
            System.out.println("Não há produtos cadastrados na lista");
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
            if ((p.getName() == product.getName()) && (p.getBrand() == product.getBrand())) {
                p.setQuantity(p.getQuantity()+ product.getQuantity());
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
                p.setName(name);
                p.setAisle(aisle);
                p.setKind(kind);
                p.setQuantity(quantity);
                p.setBrand(brand);
            }
        }
    }
}
