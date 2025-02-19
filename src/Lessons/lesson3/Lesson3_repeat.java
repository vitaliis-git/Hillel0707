package Lessons.lesson3;

import java.util.Scanner;

import static java.lang.Math.*;

public class Lesson3_repeat {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println(max(a, b));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 2 цілих числа");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int suma = c + d;
        System.out.println("Сума введених чисел: "+ suma);
    }
}
