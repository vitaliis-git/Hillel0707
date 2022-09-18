package Lessons.lesson14.exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        writeSomething("blablabla");
    }

    public static void writeSomething(String str) throws IOException {
        FileWriter fileWriter = new FileWriter("text.txt");
        fileWriter.close();
        fileWriter.write(str);

    }
}
