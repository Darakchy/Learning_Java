package student;

import java.util.Arrays;

public class ShopAsistent {
    private String name;
    private Product[] products;

    public ShopAsistent(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return name +
                ", products = " + Arrays.toString(products);
    }
}
