package OOP;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {        //getXY method which will return x , y values as two-element array
        return new float[]{x, y, z};
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%f,%f,%f)", x, y, z);
    }
}
