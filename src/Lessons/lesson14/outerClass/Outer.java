package Lessons.lesson14.outerClass;

public class Outer {
    int num;

    private class Inner_Demo{ //внутрішній клас
        public void print() {
            System.out.println("Это внутренний класс");
        }
    }

    void display_Inner(){ // метод для роботи з внутрішнім класом
        Inner_Demo inner_demo = new Inner_Demo();
        inner_demo.print();
    }
}
