import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1="Vi,du,Split,boi,Vietjack.com";
        String[] words=s1.split(",");//chia chuoi dua tren string phan cac nhau boi khoang trang (\\s)
//su dung vong lap foreach de in cac phan tu trong mang chuoi
        for(String w:words){
            System.out.println(w);
        }


        int choice = 0;
        do {
            System.out.println("----Chương trình quản lý danh bạ----");
            System.out.println("Chọn chức năng theo số (để tiếp tục): ");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ File");
            System.out.println("7. Ghi vào File");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.print("Không hợp lệ.");
                    break;
            }
            choice = 0;
        }while (choice != 8);
    }
}
