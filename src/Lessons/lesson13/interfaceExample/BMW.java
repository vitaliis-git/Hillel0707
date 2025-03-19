package Lessons.lesson13.interfaceExample;

public class BMW implements Car, Parts{ // інтерфейс підтримує множественну імплементацію, тобто 1 клас може наслідувати 2 інтерфейса
    @Override
    public String maxSpeed() {
        return null;
    }

    @Override
    public void drive() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void hoodOrder() {

    }

    @Override
    public void wheelsOrder() {

    }

    @Override
    public void filtersOrder() {

    }
}
