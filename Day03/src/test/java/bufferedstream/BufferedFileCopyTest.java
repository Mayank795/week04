package bufferedstream;

import org.junit.jupiter.api.*;
import java.io.*;
import java.lang.reflect.Method;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class BufferedFileCopyTest {
    private static final String SOURCE_FILE = "test_largefile.dat";
    private static final String DEST_BUFFERED = "test_copy_buffered.dat";
    private static final String DEST_UNBUFFERED = "test_copy_unbuffered.dat";

    @BeforeEach
    void setUp() throws IOException {
        // Create a 1MB test file
        byte[] data = new byte[1024 * 1024];
        Files.write(Paths.get(SOURCE_FILE), data);
    }

    @Test
    void testBufferedCopy() throws IOException {
        BufferedFileCopy.copyUsingBufferedStreams(SOURCE_FILE, DEST_BUFFERED);
        assertTrue(Files.exists(Paths.get(DEST_BUFFERED)));
        assertEquals(Files.size(Paths.get(SOURCE_FILE)), Files.size(Paths.get(DEST_BUFFERED)));
    }

    @Test
    void testUnbufferedCopy() throws Exception {
        // Use Reflection to access private method
        Method method = BufferedFileCopy.class.getDeclaredMethod("copyUsingUnbufferedStreams", String.class, String.class);
        method.setAccessible(true); // Allow access to private method
        method.invoke(null, SOURCE_FILE, DEST_UNBUFFERED); // Call the method

        assertTrue(Files.exists(Paths.get(DEST_UNBUFFERED)));
        assertEquals(Files.size(Paths.get(SOURCE_FILE)), Files.size(Paths.get(DEST_UNBUFFERED)));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(SOURCE_FILE));
        Files.deleteIfExists(Paths.get(DEST_BUFFERED));
        Files.deleteIfExists(Paths.get(DEST_UNBUFFERED));
    }
}
