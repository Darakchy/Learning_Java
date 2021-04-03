package store;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order o) {
        //todo add here
        orders.add(o);
    }

    public int total() {
        int buf = 0;
        for (Order o : orders)
            buf += o.total();
        return buf;
    }

    public int quantityOf(String productName) {
        int buf = 0;
        for (Order order : orders)
            buf += order.quantityOf(productName);
        return buf;
    }
}
