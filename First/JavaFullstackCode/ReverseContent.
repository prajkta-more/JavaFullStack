
package Tyif;

import java.io.*;

public class ReverseContent {
    public static void main(String[] args) {
        String inputPath = "input.txt";
        String outputPath = "reversed_output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            String content = "";
            String line;

            while ((line = reader.readLine()) != null) {
                content = line + "\n" + content;  // reverse by prepending lines
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
            writer.write(content);
            writer.close();

            System.out.println("File content reversed successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
