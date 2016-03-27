package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {

    private Temperature temperature;
    @Before
    public void setUp() throws Exception{
        temperature = new Temperature();
    }

    @Test
    public void testCelsiusToFahrenheit() throws Exception {
        double celsius = 36.6;

        double result = temperature.celsiusToFahrenheit(celsius);

        assertEquals(((1.8 * celsius) + 32), result, 0);
    }

    @Test
    public void testFahrenheitToCelsius() throws Exception {
        double fahrenheit = 120;

        double result = temperature.fahrenheitToCelsius(fahrenheit);

        assertEquals(((5.0 / 9.0) * (fahrenheit - 32)), result, 0);
    }
}