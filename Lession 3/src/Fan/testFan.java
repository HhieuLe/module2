package Fan;

import java.io.InputStream;
import java.util.Scanner;

public class testFan {
    public static void main(String[] args) {
        InputStream src;
        Scanner scanner = new Scanner(System.in);

        Fan Fan1 = new Fan(3,true,"yellow",10);
        System.out.println(Fan1.toString());
        Fan Fan2= new Fan(2,false,"Blue", 5);
        System.out.println(Fan2.toString());
    }
}
