package org.example;

public class Triangle implements Figure {

    private double a;
    private double b;
    private double c;
    private String colorFill;
    private String colorBorder;

    public Triangle(double a, double b, double c, String colorFill, String colorBorder)  {
        this.a = a;
        this.b = b;
        this.c = c;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double d = calculatePerimeter()/2;
        return Math.sqrt(d*(d-a)*(d-b)*(d-c));
    }

    @Override
    public String getColorFill() {
        return colorFill;
    }

    @Override
    public String getColorBorder() {
        return colorBorder;
    }
}
