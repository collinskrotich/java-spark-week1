package org.crotich;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {
    @Test
    @DisplayName("Test if encoding is working OK")
    void testEncoding(){
        Data data = new Data();
        data.setProcess(1);
        data.setMessage("A");
        data.setKey(3);
        String output = Process.run(data);
        assertEquals("D", output);

    }
    @Test
    @DisplayName("Test if decoding is working OK")
    void testDecoding(){
        Data data = new Data();
        data.setProcess(2);
        data.setMessage("D");
        data.setKey(3);
        String output = Process.run(data);
        assertEquals("A", output);
    }
    @Test
    @DisplayName("Test if unknown process is working OK")
    void testUnknownProcess(){
        Data data = new Data();
        data.setProcess(3);
        data.setMessage("D");
        data.setKey(3);
        String output = Process.run(data);
        assertEquals("null", output);
    }

}