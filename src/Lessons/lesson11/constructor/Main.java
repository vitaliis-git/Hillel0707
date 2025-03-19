package Lessons.lesson11.constructor;

public class Main {

    public static void main(String[] args) {

        Animal_Neyavnyi animalNeyavnyi = new Animal_Neyavnyi();
        animalNeyavnyi.sayAge();
        animalNeyavnyi.sayName();

        Animal_Yavnyi animalYavnyi = new Animal_Yavnyi("Cat", 5);
        animalYavnyi.sayName();
        animalYavnyi.sayAge();
    }
}
