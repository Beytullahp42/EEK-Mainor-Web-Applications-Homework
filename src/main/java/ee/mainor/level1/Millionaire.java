package ee.mainor.level1;

import java.util.ArrayList;

public class Millionaire {

    public static void main(String[] args) {
        //todo create a Garage.
        // create a Garage and put Ferrari in it.
        // print out Ferrari and make it print out sth nice (other than ee.mainor.level1.Ferrari@1c20c684)
        // add a list of cars to Garage
        // add another Ferrari to Garage
        // make Garage print out a list of cars in it

        Garage garage = new Garage();
        Ferrari ferrari = new Ferrari();
        garage.cars.add(ferrari);
        ferrari.drive();
        System.out.println(ferrari.name);

        ArrayList<Ferrari> cars = new ArrayList<>();
        cars.add(new Ferrari("Ferrari 2", "blue"));
        cars.add(new Ferrari("Ferrari 3", "green"));
        garage.cars.addAll(cars);
        garage.cars.add(new Ferrari("Ferrari 4", "yellow"));
        System.out.println("\nCars in garage:\n");
        garage.showCars();
    }
}
