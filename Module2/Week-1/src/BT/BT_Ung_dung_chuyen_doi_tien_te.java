package BT;

import java.util.Scanner;

public class BT_Ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd*23000;
        System.out.print("Giá trị VND: " + quydoi);

    }
}
