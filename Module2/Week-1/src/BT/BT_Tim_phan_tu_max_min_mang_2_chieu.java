package BT;

public class BT_Tim_phan_tu_max_min_mang_2_chieu {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        int max = arr[0][0];
        int min = arr[0][0];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int) Math.floor(Math.random()*100 + 10);
                if (max < arr[i][j]){
                    max = arr[i][j];
                    a= i;
                    b= j;
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (min > arr[i][j]){
                    min = arr[i][j];
                    c= i;
                    d= j;
                }
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: "+ max +"\nThuộc dòng: "+ a +", cột: "+ b);
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+ min +"\nThuộc dòng: "+ c +", cột: "+ d);

        }
    }
