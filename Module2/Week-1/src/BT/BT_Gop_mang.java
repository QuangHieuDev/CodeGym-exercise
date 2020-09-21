package BT;

public class BT_Gop_mang {
    public static void main(String[] args) {
        int[] arr1 = {3,5,1,5,1,4,8,5,1};
        int arr2[] = {30,94,2,5,8,2,1,5,2};
        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++){
            if (i < arr1.length) arr3[i] = arr1[i];
            else arr3[i] = arr2[i - arr1.length];
            System.out.print(arr3[i] + ", ");
        }
    }
}
