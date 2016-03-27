package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeometryTest {

    private Geometry geometry;
    @Before
    public void setUp() throws Exception{
        geometry = new Geometry();
    }

    @Test
    public void testTriangleArea() throws Exception {
        double side = 10;
        double height = 5;

        double result = geometry.triangleArea(side, height);

        assertEquals(((side / 2) * height), result, 0);
    }

    @Test
    public void testRectangleArea() throws Exception {
        double a = 7;
        double b = 9;

        double result = geometry.rectangleArea(a, b);

        assertEquals(a * b, result, 0);
    }

    @Test
    public void testCircleArea() throws Exception {
        double radius = 8;

        double result = geometry.circleArea(radius);

        assertEquals((Math.PI * Math.pow(radius, 2)), result, 0);
    }
}