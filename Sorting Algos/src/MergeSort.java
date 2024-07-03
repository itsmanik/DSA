public class MergeSort {

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        // Find the sizes of two sub arrays to be merged
        int n1 = mid - si + 1;
        int n2 = ei - mid;

        // Create new 2 temp arrays
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        // Copy the data to temp arrays
        for(int i = 0; i < n1; i++) {
            arr1[i] = arr[si + i];
        }
        for(int i = 0; i < n2; i++) {
            arr2[i] = arr[i + mid + 1];
        }

        // Merge the temp arrays
        // Initial indices of first and second arrays
        int i = 0, j = 0;
        // Initial index of merged sub array
        int k = si;

        while(i < n1 && j < n2) {
            if(arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from array 1 if any
        while(i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements from array 2 if any
        while(j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int si, int ei) {
        if(si >= ei) return;
        int mid = (si + ei) / 2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 10, 1, 8, 7, 1, 4, 0};
        System.out.println("Before sorting: ");
        print(arr);
        int n = arr.length;
        sort(arr, 0, n-1);
        System.out.println("After sorting: ");
        print(arr);
    }
}
