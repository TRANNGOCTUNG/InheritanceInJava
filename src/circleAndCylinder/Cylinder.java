package circleAndCylinder;

public class Cylinder extends Circle{
    private double high;

    public Cylinder(double high, double radius) {
        super(radius);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    public double getArea() {
        return super.getPerimeter()*high;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cylinder{" +
                "high=" + high +
                "Area = " + (int)getArea() +
                '}';
    }
}
