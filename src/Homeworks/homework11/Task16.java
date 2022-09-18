package Homeworks.homework11;

import java.util.Scanner;

public class Task16 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
        System.out.println("Введите целое число: ");
        int num;
        num = scanner.nextInt();
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию: ");
        char operation;
        operation = scanner.next().charAt(0);
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> System.out.println("Вы ввели неверную операцию");
        }
        return result;
    }
}
