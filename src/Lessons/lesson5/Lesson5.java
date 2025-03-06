package Lessons.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {

//        int[][] twoDimArray = new int[3][4];
//        twoDimArray[0][0] = 5;
//        twoDimArray[0][1] = 4;
//        twoDimArray[0][2] = 4;
//        twoDimArray[0][3] = 4;
//        System.out.println(twoDimArray[0][1]);
//

//        int[][] twoDimArray2 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
//        System.out.println(twoDimArray2[1][0]);


        int[][] twoDimArray3 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + twoDimArray3[i][j] + " ");
            }
            System.out.println();
        }


        int[][] twoDimArray4 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        for (int i = 0; i < twoDimArray4.length; i++) {
            for (int j = 0; j < twoDimArray4[i].length; j++) {
                System.out.print(" " + twoDimArray4[i][j] + " ");
            }
            System.out.println();
        }


        int[][] twoDimArray5 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        System.out.println(Arrays.deepToString(twoDimArray5));


        String name = "Hello, I am Vitalii!";
        System.out.println(name.length());

        String text1 = "Hello,";
        String text2 = " I am Vitalii!";
        System.out.println(text1.concat(text2));

        String text3 = "   Hello world   ";
        String text4 = "   Hello world   ";
        System.out.println(text3);
        System.out.println(text4.trim());

        String text5 = "Hello studenTs";
        System.out.println(text5.toUpperCase());
        System.out.println(text5.toLowerCase());


        String name2 = "Hello, I am Alex";
        System.out.println(name2.charAt(4));
        System.out.println(name2.indexOf("l"));
        System.out.println(name2.lastIndexOf("l"));

        System.out.println(name2.replace("Alex", "Vitalii"));



        sayHello();

        mySum(3, 5);
        mySum(6, 5);

        int mathOperation = mySum2(10, 2);
        int finalResult = mathOperation + 7;
        System.out.println(finalResult);

        sayNameAndAge("Vitalii", 35);



    }

    static void sayHello() {
        System.out.println("Hello World!");
    }

    static int mySum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    static int mySum2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static void sayNameAndAge(String name, int age) {
        System.out.println(name + " " + age);
    }


}
