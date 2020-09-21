package th;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TotalFileText {
    public static void main(String[] args) throws IOException {
        try {
            File infile = new File("Temp/num.txt");
            //System.out.println(infile.getAbsoluteFile());
            FileReader fileReader = new FileReader(infile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            int sum = 0;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi.");
        }
    }
}
