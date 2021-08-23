package QuadraticEquation;

import java.util.Scanner;

public class testQuadraticQquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c= sc.nextInt();

        QuadraticEquation qe= new QuadraticEquation(a,b,c);
        if(qe.getDiscriminant()<0){
            System.out.println("The quation has no roots");
        }else if (qe.getDiscriminant()==0){
            System.out.println("Root : "+qe.getRoot1());
        }else {
            System.out.println("Root 1: "+qe.getRoot1());
            System.out.println("Root 2: "+qe.getRoot2());
        }
    }
}
