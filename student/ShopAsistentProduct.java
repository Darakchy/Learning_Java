package student;

public class ShopAsistentProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Pich", 30, 2);
        Product p2 = new Product("Wine", 50, 1);
        Product p3 = new Product("Chees", 160, 1);
        Product p4 = new Product("Meat", 85, 2);
        Product p5 = new Product("Bread", 5, 4);
        Product[] allP = {p1, p2, p3, p4, p5};

        ShopAsistent George = new ShopAsistent("George", allP);

        int c1 = calculateProfit(George);
        System.out.println(c1);
        sort(George, 50);
    }

    static int calculateProfit(ShopAsistent shopAsistent) {
        Product[] products = shopAsistent.getProducts();
        int buf = 0;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            buf += product.getPrice() * product.getQuantity();
        }
        return buf;
    }

    static void sort(ShopAsistent asistent, int minPrice) {
        Product[] products2 = asistent.getProducts();
        for (int i = 0; i < products2.length; i++) {
            Product p = products2[i];
            if (p.getPrice() >= minPrice) {
                System.out.println(p);
            }
        }

    }
}
