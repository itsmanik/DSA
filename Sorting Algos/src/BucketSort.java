import java.util.ArrayList;

public class BucketSort {
    public static void bucketSort(int[] arr) {
//        int n = arr.length;
//        ArrayList<> list = new ArrayList<>();
//        for(int j = 0; j < n; j++) {
//            list[j] = new ArrayList<>;
//        }
//        for(int i = 0; i < n; i++) {
//            int index = (int) (arr[i] / n);
//
//        }
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{13, 23, 54, 23, 73, 46, 32, 63, 77};
        System.out.println("Before sorting: ");
        print(arr);
        bucketSort(arr);
        System.out.println("After sorting: ");
        print(arr);
    }
}
