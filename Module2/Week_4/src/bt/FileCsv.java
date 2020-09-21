package bt;

import java.io.*;

public class FileCsv {
    public static void main(String[] args) throws IOException {
        String csvFile = "Temp/num.csv";
        File temp = new File(csvFile);
        temp.createNewFile();

        FileReader fileReader = new FileReader(temp);
        int lines;
        //int read():Nó được sử dụng để trả về một ký tự trong mẫu ASCII. Nó trả về -1 vào cuối tập tin.
        //cần ép kiểu char
        while ((lines = fileReader.read()) != -1){
            System.out.print((char)lines);
        }
        //System.out.println(temp.length());

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } br.close();
    }
}
