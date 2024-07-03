public class SelectionSort {
    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
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
