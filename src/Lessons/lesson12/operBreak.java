package Lessons.lesson12;

public class operBreak {

    public static void main(String[] args) {

        int i = 1;
        int a = 3;
        while (i <= 5) {
            System.out.println(i + " цикл выполняется");
            if (i == a) {
                break;
            }
            i++;
        }
    }
}
