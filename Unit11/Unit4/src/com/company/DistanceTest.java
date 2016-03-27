package com.company;

import org.junit.Assert;
import org.junit.Test;

public class DistanceTest {

    @Test
    public void testDistanceBetweenPoints() throws Exception {
        double x1 = -7;
        double x2 = 10;
        double y1 = 0;
        double y2 = -11;

        Distance distance = new Distance();

        double result = distance.distanceBetweenPoints(x1, y1, x2, y2);

        Assert.assertEquals((Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))), result, 0);
    }
}