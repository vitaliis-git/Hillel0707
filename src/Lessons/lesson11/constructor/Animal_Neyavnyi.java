package Lessons.lesson11.constructor;

public class Animal_Neyavnyi {

    public Animal_Neyavnyi() {
        System.out.println("Hello");
    } // неявний конструктор, викликається завжди при викликанні методів класу в мейні

    void sayName() {
        System.out.println("Cow");
    }

    void sayAge() {
        System.out.println(16);
    }
}
