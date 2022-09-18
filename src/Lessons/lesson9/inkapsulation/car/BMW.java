package Lessons.lesson9.inkapsulation.car;

import Lessons.lesson9.inkapsulation.specification.Specific;

public class BMW {

    public static void main(String[] args) {

        Specific specific = new Specific();
        System.out.println(specific.getFuel());

//        specific.getFuel() = "Diesel";
//        System.out.println(specific.getFuel());

        specific.setFuel("Electro");
        System.out.println(specific.getFuel());
    }
}
