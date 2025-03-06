package Lessons.lesson4;

import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {

        System.out.println("Введите число 12, 24 или 35: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 12:
                System.out.println("Вы ввели число 12");
                break;
            case 24:
                System.out.println("Вы ввели число 24");
                break;
            case 35:
                System.out.println("Вы ввели число 35");
                break;
            default:
                System.out.println("Вы ввели неверное число");
                break;
        }


        switch (number) {
            case 12 -> System.out.println("Вы ввели число 12");
            case 24 -> System.out.println("Вы ввели число 24");
            case 35 -> System.out.println("Вы ввели число 35");
            default -> System.out.println("Вы ввели неверное число");
        }


        String[] array2 = {"Hello", "World"};
        int[] array1 = {133, 542, 233, 467};

        int array2Length = array2.length;
        System.out.println(array2Length);

        int array1Length = array1.length;
        System.out.println(array1Length);

        System.out.println(array1[2]);
        System.out.println(array2[1]);

        int[] array3 = new int[3]; // створюємо пустий масив з трьома елементами
        array3[0] = 5;
        array3[1] = 66;
        array3[2] = 58;
        System.out.println(array3[1]);

        // Ненаповнені(пусті) масиви:
        // int = 0;
        // String = null;
        // boolean = false;
        // float, double = 0.0;



        int i = 1;
        while (i < 8){      //while
            System.out.println(i);
            i++;
        }

        int i = 100;
        while (i >= 10){     //do while
            System.out.println("reverse: " + 1);
            i -= 10;
        }

        int i = 1;
        do {
            i++;
            System.out.println(i);
        } while (i < 0);

        for (int i = 1; i <= 5; i++){          //for
            System.out.println(i + " итерация цикла" + " alex");
        }

        for (int i = 3; i >= -3; i--){
            System.out.println(i + " ");
        }

        int[] array6 = {2, 3, 4};
        System.out.println(array6[0]);

        for (int i = 0; i < array6.length; i++){
            System.out.println(array6[i]);
        }

        for (int arr : array6){              // for each
            System.out.println(arr);
        }



        int i = 100;
        while (i >= 10) {
            System.out.println(i);
            i -= 10;
        }

    }


}
