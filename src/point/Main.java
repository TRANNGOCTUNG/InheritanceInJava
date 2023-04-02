package point;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu.
                1.Point2D.
                2.Point3D.
                0.Exit.
                """);
        System.out.println("your choice: ");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                Point2D point = new Point2D();
                System.out.println("Enter tung do X = ");
                point.setX(scanner.nextFloat());
                System.out.println("Enter hoanh do Y = ");
                point.setY(scanner.nextFloat());
                System.out.println(point);
            }
            case 2 -> {
                Point3D point1 = new Point3D();
                System.out.println("Enter tung do X = ");
                point1.setX(scanner.nextFloat());
                System.out.println("Enter hoanh do Y = ");
                point1.setY(scanner.nextFloat());
                System.out.println("Enter cạnh Z = ");
                point1.setZ(scanner.nextFloat());
                System.out.println(point1);
            }
            default -> System.out.println("Please re-enter.");
        }
    }
}
