package trywithresources;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceFileReader {

    public static void readFirstLine(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                System.out.println(line);
            }
        }
    }
    public static void main(String[] args) {
        String fileName = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day04\\src\\main\\java\\trywithresources\\info.txt";
        try {
            readFirstLine(fileName);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
