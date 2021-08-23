package PointandMoveablePoint;


public class test {
    public static void main(String[] args) {
        Point tter= new Point(5,5);
        System.out.println(tter );

        MovablePoint ttt = new MovablePoint(7,8,8,9);
        System.out.println(ttt);
        System.out.println(ttt.move());

    }
}
