public class InsertionSort {
    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while(j >= 0 && curr < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 10, 1, 8, 7, 1, 4, 0};
        System.out.println("Before sorting: ");
        print(arr);
        sort(arr);
        System.out.println("After sorting: ");
        print(arr);
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Space Complexity: O(1)");
    }
}
