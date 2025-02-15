package wordcount;

import org.junit.jupiter.api.*;

import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {
    private static final String TEST_FILE = "C:\\Users\\yugap\\OneDrive\\Desktop\\cap\\Week_04\\Day03\\src\\main\\java\\wordcount\\Test.txt";

    @BeforeEach
    void setUp() throws Exception {
        Files.write(Paths.get(TEST_FILE),
                ("Hello world! Hello everyone.\n" +
                        "This is a test file. Hello world.\n" +
                        "Java is great. Java is powerful. Java is everywhere.\n").getBytes());
    }

    @Test
    void testWordCount() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        WordCount.countWords(TEST_FILE);

        String output = outContent.toString();
        assertTrue(output.contains("Total Words"));
        assertTrue(output.contains("hello: 3"));
        assertTrue(output.contains("java: 3"));
    }

    @AfterEach
    void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }
}
