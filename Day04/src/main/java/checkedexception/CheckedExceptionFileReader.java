package checkedexception;
import java.io.*;
public class CheckedExceptionFileReader {
    public static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CheckedExceptionFileReader fileReader = new CheckedExceptionFileReader();
        CheckedExceptionFileReader.readFile();
    }
}
