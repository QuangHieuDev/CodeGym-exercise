package BT;

import java.util.Scanner;

public class BT_Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
        System.out.println("4. In hình tam giác cân");
        System.out.print("Nhập số: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                for (int i=0; i < 3; i++){
                    for (int j=0; j < 7; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i=1; i <= 5; i++){
                    for (int j=1; j <= i; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                for (int i=5; i >= 1; i--){
                    for (int j=i; j >= 1; j--){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                for (int i=1; i<10; i += 2)
                {
                    for (int j=0; j < (4 - i / 2); j++)
                    {
                        System.out.print(" ");
                    }
                    for (int z=0; z<i; z++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.print("Không hợp lệ.");
                break;
        }
    }
}
