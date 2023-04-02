package shap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu:
                1.Circle.
                2.Rectangle.
                3.Square.
                4.Shape.
                0.Exit;
                """);
        System.out.println("Your choice: ");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                Circle circle = new Circle();
                System.out.println("Enter color: ");
                circle.setColor(scanner.next());
                System.out.println("Enter filled: ");
                circle.setFilled(scanner.nextBoolean());
                System.out.println("Enter radius: ");
                circle.setRadius(scanner.nextInt());
                System.out.println(circle);
            }
            case 2 -> {
                Rectangle rectangle = new Rectangle();
                System.out.println("Enter width: ");
                rectangle.setWidth(scanner.nextInt());
                System.out.println("Enter length: ");
                rectangle.setLength(scanner.nextInt());
                System.out.println(rectangle);
            }
            case 3 -> {
                Square square = new Square();
                System.out.println("Enter Side:");
                square.setSide(scanner.nextDouble());
                System.out.println(square);
            }
            default -> System.out.println("Enter re-please.");
        }
    }
}
