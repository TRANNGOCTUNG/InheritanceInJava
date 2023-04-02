package geometric;

public class Circle extends Geometric{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius , String color, String filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (radius * radius) * Math.PI;
    }
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
    public double getDiameter() {
        return radius * 2;
    }
    public void printCircle(){
    }
    @Override
    public String toString() {
        return super.toString() +
                " Circle {" +
                " radius = " + radius +
                " area = " + getArea() +
                " perimeter = " + getPerimeter() +
                " diameter = " + getDiameter() +
                '}';
    }
}
