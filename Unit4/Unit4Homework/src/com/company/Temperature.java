package com.company;

public class Temperature {

    public static double CelsiusToFahrenheit(double celsius) {
        return (1.8 * celsius) + 32;
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}
