import java.util.Scanner;

public class Borrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter money: ");
        double money = sc.nextDouble();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter rate: ");
        double rate =sc.nextDouble();
        double totalInterest=0;
        for (int i =1;i<=month;i++){
            totalInterest+=money*(rate/100)/12*month;
        }
        System.out.println("Total of interest " +totalInterest);
    }
}
