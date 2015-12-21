package com.company;

public class Main {

    public static void main(String[] args) {
        double triangleArea = Geometry.TriangleArea(4, 5);
        System.out.println("Triangle area with side 4cm and height 5cm: " + triangleArea);

       double rectangleArea = Geometry.RectangleArea(4, 6);
        System.out.println("Rectangle area with side 4cm and side 6cm: " + rectangleArea);

        double circleArea = Geometry.CircleArea(3);
        System.out.println("Circle area with radius 3cm: " + circleArea);

        System.out.println("------------------------------------------");

        double celsius = Temperature.CelsiusToFahrenheit(36.6);
        System.out.println("36.6°C in °F: " + celsius);

        double fahrenheit = Temperature.FahrenheitToCelsius(120);
        System.out.println("120°F in °C: " + fahrenheit);

        System.out.println("------------------------------------------");

        double distance = Distance.DistanceBetweenPoints(-3, -3, 2, 2);
        System.out.println("Distance between two points: " + distance);
    }
}
