package Lessons.lesson13.abstractExample;

abstract class Car {

    abstract String maxSpeed(); // абстрактні методи і властивості мають обовязково бути реалізовані в класах наслідниках

    abstract void drive();

    abstract void brake();

    void countWheels() {
        System.out.println("4");
    } // не абстрактні методи - реалізовувати не обовязково


}
