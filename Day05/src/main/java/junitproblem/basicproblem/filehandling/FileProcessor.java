package junitproblem.basicproblem.filehandling;

import java.io.*;

public class FileProcessor {

    public void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    public String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();
        String filename = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day05\\src\\main\\java\\junitproblem\\basicproblem\\filehandling\\test.txt";
        try {
            fileProcessor.writeToFile(filename, "Hello, World!");
            System.out.println("File Content: " + fileProcessor.readFromFile(filename));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
