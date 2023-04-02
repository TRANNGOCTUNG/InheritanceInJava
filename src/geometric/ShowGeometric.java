package geometric;

import java.util.Scanner;

public class ShowGeometric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu.
                1.Circle.
                2.Rectangle.
                0.Exit.
                """);
        System.out.println(" your choice: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                System.out.println("--------------Class Circle------------------");
                Geometric g = new Circle();
                Circle c = (Circle) g;
                System.out.println("Enter radius : ");
                c.setRadius(scanner.nextInt());
                System.out.println(c);
                System.out.println(g);
                System.out.println("---------------End-----------------");
            }
            case 2 -> {
                System.out.println("--------------Class Rectangle----------------");
                Geometric g = new Rectangle();
                Rectangle r = (Rectangle) g;
                System.out.println("Enter Width: ");
                r.setWidth(scanner.nextDouble());
                System.out.println("Enter Height: ");
                r.setHeight(scanner.nextDouble());
                System.out.println(r);
                System.out.println(g);
                System.out.println("---------------End-----------------");
            }
            case 0 -> System.exit(0);
            default -> System.out.println("Please Re-Enter");
        }
    }
}
