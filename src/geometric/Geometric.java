package geometric;

public class Geometric {
    private String color;
    private String filled;

    public Geometric() {
        color = "While";
        filled = "1";
    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "Geometric " +
                " color " + " = " + color +
                " filled " + " = " + filled;
    }
    public void display(){
        System.out.println(color + filled);
    }
}
