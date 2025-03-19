//package Lessons.lesson12.staticExpl;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class fileWriter {
//    public static void main(String[] args) {
//        FileWriter fileWriter = new FileWriter("result.txt");
//        fileWriter.write("Hello world!");
//        fileWriter.close();
//
//        write(2, 9);
//    }
//
//    public static void write(int first, int second) throws IOException {
//        FileWriter fileWriter = new FileWriter("result.txt");
//        for (int i = first; i < second; i++){
//            fileWriter.write(i + "\n");
//        }
//        fileWriter.close();
//    }
//}
