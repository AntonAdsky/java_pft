package ru.stqa.pft.sandbox.point;

public class Point {
    public double x;
    public double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point point, Point point2) {
        return Math.sqrt((point2.x - point.x) + (point2.y - point.y));
    }
}
