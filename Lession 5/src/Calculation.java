public class Calculation {
    void sum(int a, int b) {
        System.out.println(a + b);
    }
    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void sum(float c, int d, int e) {
        System.out.println(c + d + e);
    }
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.sum(20, 20);
        cal.sum(10, 10, 10);
        cal.sum(3.0f, 4, 5 );
    }
}
