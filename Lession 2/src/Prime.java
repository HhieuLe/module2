import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean tf = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                tf = true;
                break;
            } else {
                tf = false;
            }
        }
        if (tf) {
            System.out.print("Number not prime");
        } else {
            System.out.print("Number is prime");
        }
    }
}
