package filestreaam;

import java.io.*;

public class UpperToLowerConverter {
    public static void convertFile(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
            System.out.println("Conversion completed successfully.");

        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day03\\src\\main\\java\\filestreaam\\Project.txt";
        String outputFile = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day03\\src\\main\\java\\filestreaam\\Test.txt";

        convertFile(inputFile, outputFile);
    }
}
