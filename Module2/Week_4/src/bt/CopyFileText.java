package bt;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("Temp/Test.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("Temp/Test-copy.txt",true);
            // append ghi thêm, nếu không sẽ ghi đè
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String line = null;
            while ((line = reader.readLine()) != null){
                writer.write(line + "\n");
            }
            writer.close();
//            writer.flush();
//            //đóng khi sử lý hết

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
