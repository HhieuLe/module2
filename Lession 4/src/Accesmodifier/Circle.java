package Accesmodifier;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
    public void display(){
        System.out.println(this.getRadius());
        System.out.println(this.getArea());

    }
}
