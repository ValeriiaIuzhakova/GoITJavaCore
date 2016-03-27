package com.company;

public class Temperature {

    public static double celsiusToFahrenheit(double celsius) {
        return (1.8 * celsius) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}
