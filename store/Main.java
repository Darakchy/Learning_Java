package store;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("bananas", 20, 2);
        Product pr2 = new Product("orange", 25, 1);
        Product pr3 = new Product("grape", 12, 3);
        Product pr4 = new Product("bananas", 20, 3);

        Order or1 = new Order(1);
        Order or2 = new Order(2);

        or1.addProduct(pr1);
        or1.addProduct(pr2);
        or2.addProduct(pr2);
        or2.addProduct(pr3);
        or2.addProduct(pr4);

        Customer cus1 = new Customer("Max");
        cus1.addOrder(or1);
        cus1.addOrder(or2);

        System.out.println(cus1.total());

        System.out.println(cus1.quantityOf("bananas"));
    }
}
