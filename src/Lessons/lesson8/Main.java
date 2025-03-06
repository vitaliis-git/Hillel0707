package Lessons.lesson8;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(); // создание обьекта Cat или создание экземпляра класса;
        cat.sayHello();

        catActions();
    }

    public static void catActions() { // метод
        Cat cat1 = new Cat(); // обьект или экземпляр класса Cat
        cat1.jump();
        cat1.run();
    }
}
