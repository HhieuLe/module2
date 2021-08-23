package CircleAndCylinder;

public class Cylinder extends Circle {
    double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + getHeight()
                + " and  the bottom surface is " + super.toString();
    }
}
