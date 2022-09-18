package Lessons.mentorlessons.lesson1;

//5. Вывести квадрат из букв смещая первый символ в конец строки, слово help:
//help
//elph
//lphe
//phel

public class Test1 {

    public static void main(String[] args) {
        String s = "help";
        methodNew(s);
    }

    static void methodNew(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s);
            s = s.substring(1) + s.charAt(0);
        }
    }
}
