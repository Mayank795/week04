package trywithresources;
import org.junit.jupiter.api.Test;
import trywithresources.TryWithResourceFileReader;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class TryWithResourceFileReaderTest {

    @Test
    public void testFileExists() {
        try {
            TryWithResourceFileReader.readFirstLine("C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day04\\src\\main\\java\\trywithresources\\info.txt");
        } catch (IOException e) {
            fail("IOException was thrown: " + e.getMessage());
        }
    }

    @Test
    public void testFileDoesNotExist() {
        IOException exception = assertThrows(IOException.class, () -> {
            TryWithResourceFileReader.readFirstLine("nonexistentfile.txt");
        });
        assertEquals("nonexistentfile.txt (The system cannot find the file specified)", exception.getMessage());
    }
}
