package store;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private List<Product> products;

    public Order(int id) {
        this.id = id;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        //add here
        products.add(p);
    }

    public int total() {
        int buf = 0;
        for (Product p : products)
            buf += p.getPrice() * p.getQuantity();
        return buf;
    }

    public int quantityOf(String productName) {
        int buf = 0;
        for (Product p : products)
            if (p.getName().equals(productName))
                buf += p.getQuantity();
        return buf;
    }
}
