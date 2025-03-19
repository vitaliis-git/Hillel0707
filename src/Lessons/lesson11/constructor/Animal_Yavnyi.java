package Lessons.lesson11.constructor;

public class Animal_Yavnyi {

    public Animal_Yavnyi(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    void sayName() {
        System.out.println(name);
    }

    void sayAge() {
        System.out.println(age);
    }
}
