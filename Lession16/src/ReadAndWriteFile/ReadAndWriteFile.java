package ReadAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile("D:\\Modeule2.1\\Lession16\\src\\ReadAndWriteFile\\number.txt");
        int maxValue= findMax(number);
        readAndWriteFile.writeFile("D:\\Modeule2.1\\Lession16\\src\\ReadAndWriteFile\\resuld.txt",maxValue);
    }


    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File khong ton tai or noi dung loi!!!");
        }
        return number;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Gia tri lon nhat la: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }
}