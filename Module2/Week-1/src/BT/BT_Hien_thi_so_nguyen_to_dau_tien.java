package BT;

import java.util.Scanner;

public class BT_Hien_thi_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên tố cần hiển thị: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        int n= 2;
        while (count<num) {
            boolean check = true;
            for (int i= 2; i <= n/2; i++) {
                if (n%i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}