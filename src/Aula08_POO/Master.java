package Aula08_POO;

public class Master {

    public static void main(String[] args) {

        Stock stock = new Stock("Estoque do mercado");

        stock.addProduct(new Product("Leite", "Laticínios", "Leite Integral", 100, "Longa Vida"));
        Product pasta = new Product("Macarrão", "Massas", "Integral", 50, "Renata");
        Product pasta2 = new Product("Macarrão", "Massas", "Ovos", 100, "Renata");
        stock.addProduct(pasta);
        stock.addProduct(pasta2);
        stock.listProducts();
        System.out.println();
        stock.removeProduct(1);
        stock.listProducts();
        stock.updateProduct(2,"Macarrão", "Massas", "Integral", 150, "Barilla");
        System.out.println();
        stock.readProduct(2);

    }
}
