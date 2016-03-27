package com.company;

public class Geometry {

    public static double triangleArea(double side, double height) {
        return (side / 2) * height;
    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
