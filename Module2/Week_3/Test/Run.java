import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Run {
    public List<Listclass> students = new ArrayList<>();
    public Scanner input = new Scanner(System.in);
    public void main(String[] args) {
        int menu = 0;
        //List<Listclass> students = new ArrayList<>();
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách.");
            System.out.println("2. Thêm vào danh sách.");
            System.out.println("3. Xóa danh sách.");
            System.out.println("4. Exit.");
            menu = input.nextInt();

            switch (menu){
                case 1:
                    display();
                    break;
                case 2:

                    break;
                case 3:
                    del();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.print("Không hợp lệ.");
                    break;
            }
            menu = 0;
        }while (menu != 4);

    }

    public void display(){
        for (int i = 0; i < students.size(); i++){
            System.out.println("ID: "+ i+ ", Name: "+students.get(i).getName()+" ,Age: "+students.get(i).getAge()); }
    }
    public void add(){
        int num = 1;
        do {
            System.out.println("Nhập tên: ");
            String name = input.next();
            System.out.println("Nhập tuổi: ");
            int age = input.nextInt();
            students.add(new Listclass(age, name));
            System.out.println("1 để tiếp tục nhập, 0 để trở về menu chính");
            num = input.nextInt();
        } while (num != 0);
    }
    public void del(){
        display();
        System.out.print("Nhập ID cần xóa: ");
        //students.clear();
        //System.out.println("Danh sách bị xóa.");
        students.remove(input.nextInt()-1);
        System.out.println("Danh sách sau khi xóa: ");
        for (int i = 0; i < students.size(); i++){
            System.out.println("ID: "+ i+1 + ", Name: "+students.get(i).getName()+" ,Age: "+students.get(i).getAge());}
    }
}

class Test{
    public static void main(String[] args) {
        int[] arr = {1,23,546,7,75,87,433,665,76,8,33,4,5,6,5};

    }
}