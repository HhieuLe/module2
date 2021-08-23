package ReadFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileText {
    public static void main(String[] args) {
        //System.out.println("Nhap duong dan file: ");
        //String path = new Scanner(System.in).nextLine();
        String path = "D:\\Modeule2.1\\Lession16\\src\\ReadFileExample\\123.txt";
//        ReadFileText readfileEx = new ReadFileText();
        readFileText(path);
    }

    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Toong = " + sum);
        } catch (Exception e) {
            System.err.println("File ");
           System.out.println(e);
     }
    }
}