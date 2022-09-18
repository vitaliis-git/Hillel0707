package Lessons.mentorlessons.lesson5.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// как проверить email на валидность
public class Main {
    public static void main(String[] args) {
        final String string = "kjhkjh@sdfdsf.sdf";

        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);

        if (matcher.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email not valid");
        }
    }
}
