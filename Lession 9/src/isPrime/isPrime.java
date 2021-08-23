package isPrime;

public class isPrime {
    public static boolean Prime(int number) {
        boolean check = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            } else {
                check = true;
            }
        }
        return check;
    }
}
