package CopyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileClone {
    public static List<String> copyFile(File file) {
        List<String> input = new ArrayList<>();
        try {
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            FileWriter fw = new FileWriter("final.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String line = "";
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            fw.close();
            read.close();
        } catch (Exception e){
            System.out.println(e);
        };
        return input;
    }

    public static void main(String[] args) {

    }
}
