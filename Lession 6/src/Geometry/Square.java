package Geometry;

public class Square implements Colorable {
    public double side = 1;
    public String color;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.");
    }
    public String toString(){
        return "A square has side = " +getSide()+", color with "+getColor();
    }
}
