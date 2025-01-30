package dev.erica.loop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(new String[]{});

        String expectedOutput = "5 x 1 = 5\n" +
                                "5 x 2 = 10\n" +
                                "5 x 3 = 15\n" +
                                "5 x 4 = 20\n" +
                                "5 x 5 = 25\n" +
                                "5 x 6 = 30\n" +
                                "5 x 7 = 35\n" +
                                "5 x 8 = 40\n" +
                                "5 x 9 = 45\n" +
                                "5 x 10 = 50\n";

        assertEquals(expectedOutput.replace("\n", System.lineSeparator()), outContent.toString());
    }
}
