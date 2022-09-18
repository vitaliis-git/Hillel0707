package Homeworks.homework5;

public class Test9 {

    public static void main(String[] args) {

        String [][] twoDimArray = {{"*", "*", "*", "*", "*"}, {"*", "*", "*", "*", "*"}, {"*", "*", "*", "*", "*"}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
