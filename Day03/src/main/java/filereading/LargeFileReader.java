package filereading;


import java.io.*;

public class LargeFileReader {
    public static void readLargeFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day03\\src\\main\\java\\filereading\\large_file1.txt";
        readLargeFile(filePath);
    }
}
