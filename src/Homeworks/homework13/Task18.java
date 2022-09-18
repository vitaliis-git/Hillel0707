package Homeworks.homework13;

public class Task18 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int c : array) {
            if (c % 2 == 0) {
                c = 0;
                System.out.print(c + " ");
            }
        }
    }
}
