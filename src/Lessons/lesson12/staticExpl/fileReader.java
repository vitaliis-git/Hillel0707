package Lessons.lesson12.staticExpl;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class fileReader {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("file1.txt");
    }

}
