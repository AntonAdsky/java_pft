package ru.stqa.pft.sandbox.figures;

public class Square implements Figure {
    public double l;

    public Square(double l) {
        this.l = l;
    }

    public double area() {
        return l * l;
    }

    public void print() {
        System.out.println("Area of square with len " + l + " is: " + area());
    }
}
