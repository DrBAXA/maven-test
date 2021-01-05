package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldUseJackson_2_10_5() {
        ObjectMapper objectMapper = new ObjectMapper();
        assertEquals(2, objectMapper.version().getMajorVersion());
        assertEquals(10, objectMapper.version().getMinorVersion());
        assertEquals(5, objectMapper.version().getPatchLevel());

    }
}
