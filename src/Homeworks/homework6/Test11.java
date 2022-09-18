package Homeworks.homework6;

public class Test11 {

    public static void main(String[] args) {

        for (int n = 1; n < 4; n++) {
            if (n < 3) {
                System.out.println("Это " + n + "-й урок!");
                System.out.println("   Я выполнил все домашние задания " + n + "-го урока.");
            } else {
                System.out.println("Это " + n + "-й урок!");
                System.out.println("   Я не выполнил домашние задания " + n + "-го урока.");
            }
        }

    }
}

