package hcn;

import java.util.Scanner;

public class testRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        int width = sc.nextInt();
        System.out.println("Nhập chiều cao: ");
        int height = sc.nextInt();

        Rectangle rec = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rec.display());
//        System.out.println("Perimeter of the Rectangle: "+ Rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rec.getArea());

    }
}
