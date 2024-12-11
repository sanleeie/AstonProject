package org.example;

public class Rectangle implements Figure {

    private double width;
    private double height;
    private String colorFill;
    private String colorBorder;

    public Rectangle(double width, double height, String colorFill, String colorBorder){
        this.width = width;
        this.height = height;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;

    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(width + height);
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
