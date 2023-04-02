package point2;

import java.util.Arrays;

public class Point1 {
    private float x, y;

    public Point1() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point1(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[] { x, y };
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                "array = " +
                Arrays.toString(getXY()) +
                '}';
    }
}
