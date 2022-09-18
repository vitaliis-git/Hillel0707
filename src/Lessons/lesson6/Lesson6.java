package Lessons.lesson6;

import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args) {
        String text = "Hello I am Maks";
        if (text.equals("Hello I am Maks")) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }


        String text2 = "Hello I am MAKS";
        if (text2.equalsIgnoreCase("Hello I am Maks")) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }


        String text3 = "Hello I an Alex";
        System.out.println(text3.indexOf("l"));
        System.out.println(text3.lastIndexOf("l"));


        int num = 1235644;
        String temp = String.valueOf(num);
        System.out.println(temp);


        String num2 = "3422";
        int temp2 = Integer.parseInt(num2);
        System.out.println(temp2);


        double num3 = 5.4999;
        System.out.println(Math.round(num3));
        System.out.println(Math.floor(num3));
        System.out.println(Math.ceil(num3));


        String[] arr = {"Привет", "меня", "зовут", "Макс"};
        reverseArray(arr);
        countWords();

    }

    public static void reverseArray(String[] arr) {
        int n = arr.length;
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }

        for (String str : arr) {
            System.out.print(str + " ");
        }


    }

    public static void countWords() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку в консоль");

        String input = scanner.nextLine();

        int count = 0;

        if (input.length() != 0) {
            count++;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


}
