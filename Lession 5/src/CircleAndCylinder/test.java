package CircleAndCylinder;

import java.util.concurrent.CyclicBarrier;

public class test {
    public static void main(String[] args) {
        Circle ct = new Circle();
        System.out.println(ct);

        ct = new Cylinder(); System.out.println(ct);

        ct = new Cylinder(3); System.out.println(ct);
//        Cylinder cyt = new Cylinder();
//        Cylinder cytt = new Cylinder(3);
//        Cylinder cyttt = new Cylinder(4,6,"blue");

//        System.out.println(cyt);
//        System.out.println(cytt);
//        System.out.println(cyttt);
    }
}
