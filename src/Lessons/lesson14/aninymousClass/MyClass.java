package Lessons.lesson14.aninymousClass;

public class MyClass {
    public void displayMessage(Message m){
        System.out.println(m.sayHello() + " это пример анонимного внутреннего класса в качестве аргумента");
    }
}
