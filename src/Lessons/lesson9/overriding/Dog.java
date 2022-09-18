package Lessons.lesson9.overriding;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Гfd");
        super.voice();
    }
}
