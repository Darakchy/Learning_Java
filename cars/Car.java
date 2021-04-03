package cars;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private int price;
    private List<Option> options;

    public int getPrice() {
        return price;
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
        options = new ArrayList<>();
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public int total() {
        int buf = price;
        for (Option o : options) {
            buf += o.getPrice();
        }
        return buf;
    }

    public void info() {
        System.out.println(name + " " + price + " " + options);
    }
}
