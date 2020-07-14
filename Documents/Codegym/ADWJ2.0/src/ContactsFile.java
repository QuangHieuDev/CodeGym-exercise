import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactsFile {
    private File file;

    public ContactsFile(String pathFile) {
        file = new File(pathFile);
    }

    public void write(ArrayList<String> phoneDirectory) throws IOException {
        FileWriter writer = new FileWriter(file);
        BufferedWriter wr = new BufferedWriter(writer);

        wr.append("Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email \n");

        for (String i: phoneDirectory){
            wr.append(i + "\n");
        }
        wr.flush();
        wr.close();
    }

    public void read(ArrayList<String> phoneDirectory) throws IOException {
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String i;
        while ((i = br.readLine()) != null) {
            phoneDirectory.add(i);
            System.out.print(i);
        }
        br.close();
    }
}
