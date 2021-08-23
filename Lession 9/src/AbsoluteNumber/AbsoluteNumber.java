package AbsoluteNumber;

public class AbsoluteNumber {
    public static int findAbsolute(int number) {
        /*        throw new UnsupportedOperationException();
        return 0;
        */
        if (number < 0)
            return -number;
        return number;
    }
}
