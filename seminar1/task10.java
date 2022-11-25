/*
 * Записать в файл следующие данные:
 * Name Surname Age
 * Kate Smith 20
 * Paul Green 25
 * Mike Black 23 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class task10 {
    public static void main(String[] args) {
        String csvFile = "data.csv";

        try (PrintWriter writer = new PrintWriter(new File(csvFile))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Name Surname Age\n");
            sb.append("Kate Smith 20\n");
            sb.append("Paul Green 25\n");
            sb.append("Mike Black 23\n");

            writer.write(sb.toString());
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
