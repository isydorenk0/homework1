package Ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2: ");
        double side2 = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);
        System.out.println("Area: " + rectangle.areaCalculator());
        System.out.println("Perimeter: " + rectangle.perimeterCalculator());
    }
}
