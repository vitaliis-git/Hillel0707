package Lessons.lesson17.comparableExmpl;

import java.util.TreeSet;

public class TreesetExmpl {

    public static void main(String[] args) {

        TreeSet<Car> cars = new TreeSet<>();

        cars.add(new Car("BMW", 23));
        cars.add(new Car("Honda", 5));
        cars.add(new Car("Toyota",4));
        cars.add(new Car("Tesla",7));

        for (Object car : cars){
            System.out.println(car );
        }
    }
}
