package Geometry;

public class test {
    public static void main(String[] args) {
        Shape sc = new Shape();
        System.out.println(sc);
        Shape scc = new Shape("yellow",false);
        System.out.println(scc);

        Circle ts = new Circle();
        System.out.println(ts);
        Circle tss = new Circle(3.5);
        System.out.println(tss);
        Circle tsss = new Circle(3.5,"violet",true);
        System.out.println(tsss);

        Rectangle rs = new Rectangle();
        System.out.println(rs);
        Rectangle rss = new Rectangle(6,6,"indigo",true);
        System.out.println(rss);

        Square ss = new Square();
        System.out.println(ss);
        Square sss = new Square(6,"nufi",true);
        System.out.println(sss);
    }
}
