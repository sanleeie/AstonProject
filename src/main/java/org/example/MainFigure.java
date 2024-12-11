package org.example;

public class MainFigure {
    public static void main (String[] args) {
        Figure circle = new Circle(10, "white", "black");
        Figure rectangle = new Rectangle(5,10, "white", "black");
        Figure triangle = new Triangle(5,5,5, "white", "black");
        infoFigure(circle);
        infoFigure(rectangle);
        infoFigure(triangle);
    }
    public static void infoFigure(Figure figure) {
        System.out.println(figure.getClass().getSimpleName());
        System.out.println("Площадь: " + figure.calculateArea());
        System.out.println("Периметр: " + figure.calculatePerimeter());
        System.out.println("Цвет фона: " + figure.getColorFill());
        System.out.println("Цвет границ: " + figure.getColorBorder());
    }
}
