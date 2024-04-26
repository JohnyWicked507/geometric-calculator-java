package src;

import java.util.Scanner;

public class Square implements Figure {
    private double side;

    public Square() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la longitud del lado del cuadrado: ");
        this.side = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
