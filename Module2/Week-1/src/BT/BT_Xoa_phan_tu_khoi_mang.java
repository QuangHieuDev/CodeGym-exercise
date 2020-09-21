package BT;

import java.util.Scanner;

public class BT_Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        Scanner input = new Scanner(System.in);
        System.out.print("Mảng ban đầu:       ");
        for (int item : arr){
            System.out.print(item + ",");
        }
        System.out.println("\n");
        System.out.println("Số thứu tự phần tử: 0,1,2,3,4,5,6,7,8,9");
        System.out.println("Nhập phần tử cần xóa trong mảng");

        int number = input.nextInt();
        for (int i = number; i < arr.length; i++){
            if (i < arr.length-1) arr[i] = arr[i+1];
            else arr[i] = 0;
        }

        System.out.print("Mảng khi loại bỏ phần tử: ");
        for (int items : arr){
            System.out.print(items + ",");
        }
    }
}
