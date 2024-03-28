package ch18.lecture.p5filter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class C09BufferedWriter {
    public static void main(String[] args) throws Exception {
        String file = "temp/output9.txt";
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < 10; i++) {
            bw.write("hello world!");
            bw.newLine();
        }
        bw.close();
    }
}