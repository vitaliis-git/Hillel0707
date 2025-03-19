package Lessons.lesson13;

import Lessons.lesson13.enumExample.Car;
import Lessons.lesson13.enumExample.Country;

public class Lesson13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " Я выполнюсь перед continue");
            if (i > 2) {
                continue; // якщо виконується умова, то код після continue не раниться
            }
            System.out.println("         " + i + " : я выполнюсь всего 2 раза :("); // якщо i>2, то даний рядок не раниться
        }

        for (Car c : Car.values()){
            System.out.println(c);
        }

        for (Car c : Car.values()){
            if (c.name().equals("BMW")){
                System.out.println("BMW cуществует");
            }
        }


    }
}
