package point;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z){
        super.getXY();
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{this.getX(),this.getY(), z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x = " + getX() +
                "y = " + getY() +
                "z=" + z +
                "Array = " + Arrays.toString(getXYZ()) +
                '}';
    }
}
