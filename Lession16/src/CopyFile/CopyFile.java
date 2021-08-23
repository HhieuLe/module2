package CopyFile;

import javax.security.auth.Subject;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<String> readFile(String filePath) {
        List<String> input = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();

            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                input.add(String.valueOf(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File khong ton tai hoac noi dung loi 1");
        }
        return input;
    }

    public void writeFile(String filePath, String Subject) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(Subject);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String findSubject(List<String> input) {
        String Subject = input.get(0);

        return Subject;
    }
}

