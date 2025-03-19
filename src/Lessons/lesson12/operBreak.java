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

        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Число 1");
                break;
            case 2:
                System.out.println("число 2");
                break;
            case 3:
                System.out.println("Число 3");
                break;
        }

        int s = 2;
        switch (s) {  // це те саме що зверху, тільки тут сучаніший вигляд
            case 1 -> System.out.println("Число 1");
            case 2 -> System.out.println("число 2");
            case 3 -> System.out.println("Число 3");
        }
    }
}
