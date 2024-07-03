public class QuickSort {

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i + 1;
    }

    public static void sort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(arr, low, high);
        sort(arr, low, pivot - 1);
        sort(arr, pivot + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 10, 1, 8, 7, 1, 4, 0};
        System.out.println("Before sorting: ");
        print(arr);
        sort(arr, 0, arr.length - 1);
        System.out.println("After sorting: ");
        print(arr);
    }
}
