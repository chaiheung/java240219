package ch18.exercise.Exercise07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/exercise/Exercise07/Example.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;

        while (true) {
            rowData = br.readLine();
            if (rowData != null) {
                rowNumber++;
                System.out.println(rowNumber + ":" + rowData);
            } else {
                break;
            }
        }
        br.close();
    }
}