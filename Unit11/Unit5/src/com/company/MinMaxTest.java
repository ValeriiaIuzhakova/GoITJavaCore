package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxTest {

    private MinMax minmax;
    @Before
    public void setUp() throws Exception{
        minmax = new MinMax();
    }

    @Test
    public void testMin() throws Exception {
        int[] array = {1, 5, 3, 7, 11, 9};

        int result = minmax.min(array);

        assertEquals(1, result);
    }

    @Test
    public void testMax() throws Exception {
        int[] array = {1, 5, 3, 7, 11, 9};

        int result = minmax.max(array);

        assertEquals(11, result);
    }
}