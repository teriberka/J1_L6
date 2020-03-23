package ru.geekbrains.J1.L6.hometask;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    private static String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    private static boolean checkWord(String word, String fileName){
        try {
            return readFile(fileName).contains(word);
        } catch (IOException e) {
            e.printStackTrace();
        } return false;
    }

    public static void writeFile(String writeString, String outFileName) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(outFileName, true));
            ps.println(writeString);
            ps.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
//            System.out.println(readFile("file_1.txt"));
//            System.out.println(readFile("file_2.txt"));
            writeFile(readFile("file_1.txt"),"out_file.txt");
            writeFile(readFile("file_2.txt"),"out_file.txt");
            System.out.println(checkWord("hello","file_1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



