package BT;

import java.util.Scanner;

public class BT_Tinh_tong_cot_va_duong_cheo_chinh {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cột cần tính tổng: ");
        int num = input.nextInt();
        int colTotal = 0;
        int diagonalTotal = 0;

        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int) Math.floor(Math.random()*100 + 10);
                if (i == j) diagonalTotal += arr[i][j];
                }
            colTotal += arr[i][num];
            }
        System.out.println("Tổng của cột "+ num + " là: "+ colTotal +"\nTổng đường chéo chính là: "+ diagonalTotal);
        }

    }
