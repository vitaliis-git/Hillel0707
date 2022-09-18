package Lessons.lesson8;

public class PolimorfizmOverload {

    public static void main(String[] args) {
        int a = 100;
        double b = 1.1;
        String c = "Alex";

        add();
        add(2, 5);
        add("Vitalii", 35);
        add(6, 98, 5);
        add(3.4,8.9);

    }

    public static void add() {
        System.out.println("Hello");
    }

    public static void add(int a, int b) { //в скобках - параметры метода;
        int c = a + b;
        System.out.println(c);
    }

    public static void add(int num, int num1, int num2) {
        int e = num + num1 + num2;
        System.out.println(e);
    }

    public static void add(double a, double b) {
        double c = a + b;
        System.out.println(c);
    }

    public static void add(String a, int b) {
        System.out.println(a + " " + b);
    }
}
