package com.company;

public class Geometry {

    public static double TriangleArea(double side, double height) {
        return (side/2)*height;
    }

    public static double RectangleArea(double a, double b) {
        return a*b;
    }

    public static double CircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
