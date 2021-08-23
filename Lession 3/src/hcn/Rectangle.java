package hcn;

public class Rectangle {
    int width;
    int height;


        public Rectangle() {

    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return this.width * this.height;
    }

    public String display() {
        return "Rectangle: " + "\nWidth: " + width + "\nHeight: " + height;
    }
}
