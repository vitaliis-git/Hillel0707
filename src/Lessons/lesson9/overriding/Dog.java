package Lessons.lesson9.overriding;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Гав");
        super.voice(); // super означає реалізацію початкового методу voice() без змін, який був прописаний в класі Animal
    }
}
