package Lessons.mentorlessons.lesson1;

/*
Создать две переменные m и n типа int.
Используя цикл for вывести на экран прямоугольник размером m на
n из восьмёрок.
Пример: m=2, n=4
8888
8888
 */

public class Task3 {

    public static void main(String[] args) {

        int m = 2;
        int n = 4;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n * m);
            }
            System.out.println();
        }
    }
}
