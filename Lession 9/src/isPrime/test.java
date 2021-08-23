package isPrime;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number= sc.nextInt();
        for(int i=2;i<number;i++){
            if(isPrime.Prime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
}
