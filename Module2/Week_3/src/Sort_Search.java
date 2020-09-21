public class Sort_Search {
    //sap xep noi bot
    static void buddle(int[] arr) {
        boolean isCheck = true;
        for (int i = 1; i < arr.length && isCheck; i++) {
            isCheck = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                    isCheck = true;
                }
            }
        }
    }
    //sap xep chon
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr,i,j);
                }
            }
        }
    }
    //sap xep chen: so sanh voi phan tu trc no neu thoa man dk thi chen len
    static void insertion(int[] arr) {
        int index;
        int j;
        for(int i = 1; i < arr.length; i++) {
            index = arr[i];
            for(j = i - 1 ; j >= 0 && index < arr[j]; j--) {
                arr[j+1] = arr[j];
            }arr[j+1] = index;
        }
    }

    static void display(int[] arr){
        for (int i : arr){
            System.out.print(i+"  ");
        }
    }

    // ham doi cho
    static void swap(int[] arr, int a, int b) {
        int tempt = arr[a];
        arr[a] = arr[b];
        arr[b] = tempt;
    }

    // sort quick
    static void quick (int[] arr, int low, int high) {
        int partition = partition(arr,low,high);
        if (partition - 1 > low) {
            quick(arr, low, partition - 1);
        }
        if (partition + 1 < high) {
            quick(arr, partition -1 , high);
        }
    }
    static int partition (int[] arr, int low, int high) {
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr,low, j);
                low++;
            }
        }
        swap(arr,low,high);
        return low;
    }

    //tim kiem nhi phan dung de quy
    static int binarySearch(int arr[], int i, int j, int k){
        if (j >= i){
            int mid = i +(j - i)/2;
            if (arr[mid] == k) return mid;
            if (arr[mid] > k) return binarySearch(arr, i, mid - 1, k);
            return binarySearch(arr, mid + 1, j, k);
        }
        return -1;
    }

//    // tim kiem nhi phan ko de quy
//    static int binarySearch(int[] list, int key) {
//        int low = 0;
//        int high = list.length - 1;
//        while (high >= low) {
//            int mid = (low + high) / 2;
//            if (key < list[mid])
//                high = mid - 1;
//            else if (key == list[mid])
//                return mid;
//            else
//                low = mid + 1;
//        }
//        return -1; /* Now high < low, key not found */
//    }

    public static void main(String[] args) {
        int[] array = {10,32,3,35,1,43,855,34,23};

//        bubble(array);
        insertion(array);
//        selection(array);
//        quick(array, 0,8);
        display(array);

//        int n = array.length;
//        int x = 10;
//        int result = binarySearch(array, 0, n - 1, x);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index " + result);
    }

}
