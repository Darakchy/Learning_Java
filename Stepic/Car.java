package Stepic;

public class Car {
    public int countOfKm;
    public int levelOfFuel;

    public void fueling(int fuel) {
        levelOfFuel += fuel;
        if (levelOfFuel > 60){
            levelOfFuel = 60;
        }
    }

    public void go(int km) {
        countOfKm += km;
        levelOfFuel -= km * 10 / 100;
    }
}
