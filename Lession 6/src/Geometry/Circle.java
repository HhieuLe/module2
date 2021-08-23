package Geometry;

public class Circle implements Resizeable {
    double radius = 1.0;
    String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A sky full of star :)";
    }

    @Override
    public void resize(double percent) {
        radius += radius * (percent / 100);
        System.out.println("Area after resize = "+this.getArea());
    }
}
