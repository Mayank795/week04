package filehandling;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day03\\src\\main\\java\\filehandling\\source";
        String destinationFile = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day03\\src\\main\\java\\filehandling\\destination.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + sourceFile);
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
