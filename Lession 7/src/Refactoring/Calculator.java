package Refactoring;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int firsrOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firsrOperand + secondOperand;
            case SUBTRACTION:
                return firsrOperand - secondOperand;
            case MULTIPLICATION:
                return firsrOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firsrOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
