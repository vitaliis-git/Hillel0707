package Homeworks.homework14;

public class Task19 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        arrExtension(a, 7);
    }

    public static int[] arrExtension(int[] arr, int number) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = number;
        for (int i : newArr) {
            System.out.print(i);
        }
        return newArr;
    }
}
