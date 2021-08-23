package Refactoring;

public class test {
    public static void main(String[] args) {
        System.out.println( Calculator.calculate(10,2,Calculator.ADDITION));
        System.out.println(Calculator.calculate(10,0,Calculator.SUBTRACTION));
        System.out.println(Calculator.calculate(10,2,Calculator.MULTIPLICATION));
        System.out.println(Calculator.calculate(10,2,Calculator.DIVISION));
    }
}
