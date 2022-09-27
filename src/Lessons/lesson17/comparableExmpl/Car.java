package Lessons.lesson17.comparableExmpl;

public class Car implements Comparable<Car>{

    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return model + " " + this.year;
    }

    @Override
    public int compareTo(Car o) {
         return this.model.compareTo(String.valueOf(o));
    }
}
