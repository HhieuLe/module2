package Cylinder;

public class Cylinder {

    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    public static double getBaseArea(double radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }

    public static double getPerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}

