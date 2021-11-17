package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.point.Point;

public class PointTest {

    @Test
    public void testDistance() {
        Point point = new Point(5,5);
        Point point2 = new Point(6,6);

        double excepted = 1.4142135623730951;

        Assert.assertEquals(Point.distance(point, point2), excepted);
    }

}
