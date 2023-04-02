package test;

public class Point2D {
    // Thuoc tinh
    private double x;
    private double y;

    // Phuong thuc
    // Ham khoi tao khong tham so
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    // Ham khoi tao co tham so
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Thay doi vi tri cua diem
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    // Tinh khoang cach giua 2 diem
    public double distance(Point2D d2) {
        return Math.sqrt((this.x - d2.x) * (this.x - d2.x) + (this.y - d2.y) * (this.y - d2.y));
    }

    // Hien thi thong tin
    @Override
    public String toString() {

        return
                "("  + this.x + "; " + this.y + ")";

    }

    // Cac ham setter

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}