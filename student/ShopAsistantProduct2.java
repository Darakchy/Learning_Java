package student;

public class ShopAsistantProduct2 {
    public static void main(String[] args) {
        Product prod1 = new Product("Choco", 30, 2);
        Product prod2 = new Product("Chees", 150, 1);
        Product prod3 = new Product("Fanta", 18, 2);
        Product prod4 = new Product("Coffee", 99, 1);
        Product prod5 = new Product("Apple", 15, 3);
        Product prod6 = new Product("Tuna", 200, 1);

        Product[] allProd = {prod4, prod3};
        Product[] allprod2 = {prod1, prod6};
        Product[] allProd3 = {prod2, prod5};

        ShopAsistent Jenya = new ShopAsistent("Jenya", allProd);
        ShopAsistent George = new ShopAsistent("George", allprod2);
        ShopAsistent Maxim = new ShopAsistent("Maxim", allProd3);

        ShopAsistent[] allSellers = {Jenya, George, Maxim};

//        print(Jenya, 50);
//        System.out.print("Total price: " + total(Jenya));
        System.out.println(bestSeller(allSellers));

    }

    static void print(ShopAsistent asis, int minPrice) {
        System.out.println("Вас обслужил " + asis.getName());
        Product[] allProdN2 = asis.getProducts();
        for (int i = 0; i < allProdN2.length; i++) {
            Product p = allProdN2[i];
            if (p.getPrice() < minPrice) {
                System.out.println(p);
            }
        }
    }

    static int total(ShopAsistent asis) {
        int buf = 0;
        Product[] allProdN2 = asis.getProducts();
        for (int i = 0; i < allProdN2.length; i++) {
            Product p = allProdN2[i];
            buf += p.getPrice() * p.getQuantity();
        }
        return buf;
    }

    static ShopAsistent bestSeller(ShopAsistent[] allSellers) {
        ShopAsistent buf = allSellers[0];
        for (int i = 1; i < allSellers.length; i++) {
            if (total(allSellers[i]) > total(buf)) {
                buf = allSellers[i];
            }
        }
        return buf;
    }
}

