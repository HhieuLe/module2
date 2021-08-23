package Poinnt23D;

public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
       super.getXY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] coordinates = new float[3];
        coordinates[0] = getX();
        coordinates[1] = getY();
        coordinates[2] = getZ();
        return coordinates;
    }

    @Override
    public String toString() {
        return "Point3D{" +super.toString()+
                "z=" + z +
                '}';
    }
}
