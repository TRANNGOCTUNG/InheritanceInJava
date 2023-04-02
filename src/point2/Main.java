package point2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu.
                1.Point1.
                2.MovablePoint.
                0.Exit.
                """);
        System.out.println("Your choice: ");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                Point1 point1 = new Point1();
                System.out.println("Enter X: ");
                point1.setX(scanner.nextFloat());
                System.out.println("Enter Y:");
                point1.setX(scanner.nextFloat());
                System.out.println(point1);
            }
            case 2 -> {
                MovablePoint point2 = new MovablePoint();
                System.out.println("Enter X:");
                point2.setX(scanner.nextFloat());
                System.out.println("Enter Y: ");
                point2.setY(scanner.nextFloat());
                System.out.println("Enter xSpeed:");
                point2.setXSpeed(scanner.nextFloat());
                System.out.println("Enter ySpeed: ");
                point2.setYSpeed(scanner.nextFloat());
                System.out.println(point2);
                point2.move();
            }
            default -> System.out.println("Please re-enter");
        }
    }
}
