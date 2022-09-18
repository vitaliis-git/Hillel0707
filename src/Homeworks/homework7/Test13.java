package Homeworks.homework7;

public class Test13 {
    public static void main(String[] args) {
        arrAverage();
    }
    public static void arrAverage() {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11 + 10);
            sum += array[i];
        }
        int average = sum / array.length;
        System.out.println(average);
    }
}
