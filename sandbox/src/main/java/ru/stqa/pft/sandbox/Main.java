package ru.stqa.pft.sandbox;

import ru.stqa.pft.sandbox.figures.Rectangle;
import ru.stqa.pft.sandbox.figures.Square;
import ru.stqa.pft.sandbox.point.Point;

public class Main {

	public static void main(String[] args) {
		Square square = new Square(5);
		square.print();

		Rectangle rectangle = new Rectangle(5, 10);
		rectangle.print();

		Point point = new Point(5,5);
		Point point2 = new Point(6,6);

		double result = Point.distance(point, point2);
		System.out.println(result);

	}

}
