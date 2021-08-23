package QuadraticEquation;

public class QuadraticEquation {
    int a, b, c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public  double getDiscriminant(){
       return this.b*this.b-4*this.a*this.c;
    }
    public double getRoot1(){
        return ((-this.b)+Math.sqrt(this.b*this.b-4*this.a*this.c))/this.a*2;
    }
    public  double getRoot2(){
       return ((-this.b)-Math.sqrt(this.b*this.b-4*this.a*this.c))/this.a*2;
    }
}
