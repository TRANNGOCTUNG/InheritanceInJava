package circleAndCylinder;

import com.sun.source.tree.BreakTree;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return (radius * radius) * Math.PI;
    }
    public double getPerimeter() {
        return (radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area Circle = " + (int)getArea() +
                "Perimeter=" + (int)getPerimeter() +
                '}';
    }
}
