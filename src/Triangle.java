package src;

import java.util.Scanner;

public class Triangle implements Figure {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo: ");
        this.base = scanner.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        this.height = scanner.nextDouble();
        System.out.print("Ingresa la longitud del lado 1 del triángulo: ");
        this.side1 = scanner.nextDouble();
        System.out.print("Ingresa la longitud del lado 2 del triángulo: ");
        this.side2 = scanner.nextDouble();
        System.out.print("Ingresa la longitud del lado 3 del triángulo: ");
        this.side3 = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}