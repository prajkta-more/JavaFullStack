package Tyif;

import java.io.*;

public class ReverseContent {
    public static void main(String[] args)
    {
        reverseLargeFile("input.txt", "reversed_output.txt");
    }

    public static void reverseLargeFile(String inputPath, String outputPath)
     {
        try (
            RandomAccessFile raf = new RandomAccessFile(inputPath, "r");
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))
        ) 
        {
            long len = raf.length();
            for (long i = len - 1; i >= 0; i--) 
            {
                raf.seek(i);
                writer.write(raf.read());
            }
            System.out.println(" File reversed: " + outputPath);
        } 
        catch (IOException e) 
        {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}