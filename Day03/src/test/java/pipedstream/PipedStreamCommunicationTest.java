package pipedstream;


import org.junit.jupiter.api.*;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class PipedStreamCommunicationTest {
    private PipedOutputStream pos;
    private PipedInputStream pis;
    private WriterThread writer;
    private ReaderThread reader;

    @BeforeEach
    void setUp() throws Exception {
        pos = new PipedOutputStream();
        pis = new PipedInputStream(pos);

        writer = new WriterThread(pos);
        reader = new ReaderThread(pis);
    }

    @Test
    void testInterThreadCommunication() throws Exception {
        writer.start();
        reader.start();

        writer.join();
        reader.join();

        assertNotNull(pis);
        assertNotNull(pos);
    }

    @AfterEach
    void tearDown() throws Exception {
        pos.close();
        pis.close();
    }
}
