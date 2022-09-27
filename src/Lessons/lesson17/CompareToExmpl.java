package Lessons.lesson17;

public class CompareToExmpl {

    public static void main(String[] args) {
        String strSample = "a";
        System.out.println("Compare to 'a' b is " + strSample.compareTo("b"));

        strSample = "c";
        System.out.println("Compare to 'c' a is " + strSample.compareTo("a"));

        strSample = "b";
        System.out.println("Compare to 'b' b is " + strSample.compareTo("b"));
    }
}
