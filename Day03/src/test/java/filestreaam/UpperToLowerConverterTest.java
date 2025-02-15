package filestreaam;


import org.junit.jupiter.api.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class UpperToLowerConverterTest {
    private static final String INPUT_FILE = "test_input.txt";
    private static final String OUTPUT_FILE = "test_output.txt";

    @BeforeEach
    void setUp() throws Exception {
        Files.write(Paths.get(INPUT_FILE), "HELLO WORLD\nJAVA PROGRAMMING".getBytes());
    }

    @Test
    void testConversion() throws Exception {
        UpperToLowerConverter.convertFile(INPUT_FILE, OUTPUT_FILE);

        File outputFile = new File(OUTPUT_FILE);
        assertTrue(outputFile.exists());

        String content = new String(Files.readAllBytes(Paths.get(OUTPUT_FILE)));
        assertEquals("hello world\njava programming\n", content);
    }

    @AfterEach
    void tearDown() throws Exception {
        Files.deleteIfExists(Paths.get(INPUT_FILE));
        Files.deleteIfExists(Paths.get(OUTPUT_FILE));
    }
}

