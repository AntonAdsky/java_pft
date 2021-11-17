package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.figures.Rectangle;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(5, 5);
        Assert.assertEquals(rectangle.area(), 25.0);
    }
}
