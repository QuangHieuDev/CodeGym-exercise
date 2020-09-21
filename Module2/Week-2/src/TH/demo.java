package TH;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        for (String i: stringList) System.out.println(i);
        for (int i = 0; i < stringList.size(); i++);
//
//        List<Student> studentList = new ArrayList<>();

//        //thường dùng do trong bài toán hay thay đổi kiểu dữ liệu
//        ArrayList<Student> students = new ArrayList<>();
//
//        Set<String> haSet = new HashSet<>();
//        while (interator.hasNext){
//            System.out.println(interator.next().getName);
//        }
//
    }
}
