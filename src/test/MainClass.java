package test;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Point2D A = new Point2D();
        Point2D B = new Point2D();

        // Nhap du lieu
        System.out.print("Nhap vao hoanh do diem A: ");
        A.setX(sc.nextDouble());
        System.out.print("Nhap vao tung do diem A: ");
        A.setY(sc.nextDouble());

        System.out.print("Nhap vao hoanh do diem B: ");
        B.setX(sc.nextDouble());
        System.out.print("Nhap vao tung do diem B: ");
        B.setY(sc.nextDouble());

        // Hien thi
        System.out.println("Toa diem diem A la: A" + A.toString());
        System.out.println("Toa diem diem A la: B" + B.toString());

        System.out.println("Khoang cach giua 2 diem A va B la: " + A.distance(B));

        sc.close();
    }
}