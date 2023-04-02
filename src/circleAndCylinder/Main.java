package circleAndCylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu:
                1.Circle:
                2.Cylinder:
                0.Exit.
                """);
        System.out.println("Your choice");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                Circle circle = new Circle();
                System.out.println("Enter radius: ");
                circle.setRadius(scanner.nextInt());
                System.out.println(circle);
            }
            case 2 -> {
                Cylinder cylinder = new Cylinder(4,5);
                System.out.println("Enter radius:");
                cylinder.setRadius(scanner.nextInt());
                System.out.println("Enter high:");
                cylinder.setHigh(scanner.nextInt());
                System.out.println(cylinder);
            }
            default -> System.out.println("Please re-enter.");
        }
    }
}
