package Geometry;

public class test {
    public static void main(String[] args) {
        Circle[] arrayCircle = new Circle[3];
        arrayCircle[0] = new Circle(3);
        arrayCircle[1] = new Circle();
        arrayCircle[2] = new Circle(5, "red");


        for (int j = 0; j<arrayCircle.length; j++){
            double a= (double)(Math.random()*100)+1;
            System.out.println(" "+(j+1));
            System.out.println("Area before resize = "+arrayCircle[j].getArea());
            arrayCircle[j].resize(a);
        }


        Square[] array = new Square[3];
        array[0] = new Square(3);
        array[1] = new Square(3, "blue");
        array[2] = new Square();

        for (int i = 0; i < array.length; i++) {
            System.out.println("-"+(i+1));
            System.out.println(array[i]);
            if (array[i].getColor() != null) {
                array[i].howToColor();
            }
        }
    }
}
