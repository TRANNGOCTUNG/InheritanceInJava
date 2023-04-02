package animal;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = new Animal();
        System.out.println("""
                Menu:
                1.Canine;
                2.Cat;
                3.Dog;
                4.Feline;
                5.Hippo;
                6.Lion;
                7.Tiger;
                8.Wolf;
                0.Exit;
                """);
        System.out.println("Your choice");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> {
                Canine can = new Canine();
                System.out.println(can);
            }
            case 2 -> {
                Cat cat = new Cat();
                System.out.println(cat);
            }
            case 3 -> {
                Dog dog = new Dog();
                System.out.println(dog);
            }
            case 4 -> {
                Feline feline = new Feline();
                System.out.println(feline);
            }
            case 5 -> {
                Hippo hippo = new Hippo();
                System.out.println(hippo);
            }
            case 6 -> {
                Lion lion = new Lion();
                System.out.println(lion);
            }
            case 7 -> {
                Tiger tiger = new Tiger();
                System.out.println(tiger);
            }
            case 8 -> {
                Wolf wolf = new Wolf();
                System.out.println(wolf);
            }
            case 0 -> System.exit(0);
            default -> System.out.println("Please Re-Enter");
        }
    }
}
