package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarAlgorithmTest {
    private CaesarAlgorithm caesarAlgorithm;

    @Before
    public void setUp() throws Exception {
        caesarAlgorithm = new CaesarAlgorithm();
    }

    @Test
    public void testEncode() throws Exception {
        String str = "Some string";

        String result = caesarAlgorithm.encode(str);

        assertEquals("Vrph2vwulqj", result);
    }

    @Test
    public void testDecode() throws Exception {
        String str = "Vrph2vwulqj";

        String result = caesarAlgorithm.decode(str);

        assertEquals("Some string", result);
    }
}