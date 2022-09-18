package Lessons.lesson9.inkapsulation.specification;

public class Specific {

    private String fuel = "Petrol";

    public void color() {
        System.out.println("Red");
    }

    public String getFuel() { //getter
        return fuel;
    }

    public void setFuel(String fuel) { // setter
        this.fuel = fuel;
    }
}
