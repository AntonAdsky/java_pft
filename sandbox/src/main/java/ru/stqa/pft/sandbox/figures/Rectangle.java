package ru.stqa.pft.sandbox.figures;

public class Rectangle implements Figure {
    public double a;
    public double b;

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public void print() {
        System.out.println("Area of rectangle with side a " + a + " and side b"  + b + " is: " + area());
    }
}
