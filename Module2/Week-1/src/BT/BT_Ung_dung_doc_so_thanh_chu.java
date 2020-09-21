package BT;

import java.util.Scanner;

public class BT_Ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int num = scanner.nextInt();
        String[] don_vi = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        String number_str = String.valueOf(num);

        switch (number_str.length()) {
            case 1:
                if (num >= 0 && num < 10) System.out.print(don_vi[num]);
                break;
            case 2:
                if (num == 10) {
                    System.out.print(don_vi[num]);
                } else if (num >10 && num <= 20) {
                    System.out.print(don_vi[(int) Math.floor(num/10)]+ "teen ");
                } else {
                    System.out.print(don_vi[(int) Math.floor(num/10)]+ "ty " + don_vi[num % 10]);
                }
                break;
            case 3:
                if (num == 100) {
                    System.out.print(don_vi[num/100]+ "hundred");
                } else if (num >100) {
                    System.out.print(don_vi[(int) Math.floor(num/100)]+ "hundred " + don_vi[num%100] + "ty " + don_vi[num%10]);
                }
                break;
        }

    }
}
