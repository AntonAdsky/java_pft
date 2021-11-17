package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.figures.Square;

public class SquareTest {

    @Test
    public void testArea() {
        Square square = new Square(5);
        Assert.assertEquals(square.area(), 25.0);
    }
}
