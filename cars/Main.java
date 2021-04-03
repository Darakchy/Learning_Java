package cars;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Option op1 = new Option("carbonHood", 800);
        Option op2 = new Option("fogLights", 300);
        Option op3 = new Option("titankyVar", 200);


        Car car1 = new Car("Golf6", 20000);
        car1.addOption(op1);
        car1.info();
        car1.addOption(op2);
        car1.info();
        car1.addOption(op3);
        car1.info();
        System.out.println(car1.total());
        List<Car> cars = new ArrayList<>();

    }

    public static int total(List<Car> cars) {
        int buf = 0;
        for (Car c: cars)
            buf += c.getPrice();
        return buf;
    }
}
