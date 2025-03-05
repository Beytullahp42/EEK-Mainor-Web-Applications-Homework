package ee.mainor.level1;

import java.util.ArrayList;

public class Garage {

    private Ferrari ferrari;

    public ArrayList<Ferrari> cars = new ArrayList<Ferrari>();

    public void showCars() {
        for (Ferrari car : cars) {
            System.out.println(car.name);
        }
    }

}
