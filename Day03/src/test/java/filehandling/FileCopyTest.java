package filehandling;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class FileCopyTest {
    private static final String SOURCE_FILE = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day03\\src\\main\\java\\filehandling\\source";
    private static final String DEST_FILE = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day03\\src\\main\\java\\filehandling\\destination.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create a small test file
        Files.writeString(Paths.get(SOURCE_FILE), "Hello, this is a test file.");
    }

    @Test
    void testFileCopy() {
        // Ensure FileCopy class has a valid method to call
        FileCopy.main(new String[]{}); // Run main method

        // Validate that the destination file is created
        assertTrue(Files.exists(Paths.get(DEST_FILE)));

        // Validate file content matches source
        try {
            assertEquals(Files.readString(Paths.get(SOURCE_FILE)), Files.readString(Paths.get(DEST_FILE)));
        } catch (IOException e) {
            fail("Error reading files: " + e.getMessage());
        }
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(SOURCE_FILE));
        Files.deleteIfExists(Paths.get(DEST_FILE));
    }
}
