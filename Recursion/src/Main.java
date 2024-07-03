import java.util.HashSet;

public class Main {

    public static void drawLine() {
        System.out.println("--------------------------------------------------------");
        System.out.println();
    }

    public static void printFib(int num1, int num2, int n) {
        if(n == 0) {
            return;
        }
        System.out.println(num1);
        int temp = num1 + num2;
        num1 = num2;
        num2 = temp;
        printFib(num1, num2, n - 1);
    }

    public static int calcPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * calcPower(x, n - 1);
    }

    public static int calcPower2(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if(n % 2 == 0) {
            return calcPower2(x, n/2) * calcPower2(x, n/2);
        } else {
            return calcPower2(x, n/2) * calcPower2(x, n/2) * x;
        }
    }

    public static void towerOfHanoi(String source, String helper, String destination, int n) {
        if(n == 1) {
            System.out.println("Moving disc " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(source, destination, helper, n-1);
        System.out.println("Moving disc " + n + " from " + source + " to " + destination);
        towerOfHanoi(helper, source, destination, n-1);
    }

    public static void printRevString(String str, int n) {
        if(n == str.length()) {
            return;
        }
        printRevString(str, n + 1);
        System.out.print(str.charAt(n));
    }

    public static int first = -1;
    public static int last = -1;
    public static void findFirstLast(String str, char ele, int index) {
        if(index == str.length()) {
            System.out.println("First = " + first);
            System.out.println("Last = " + last);
            return;
        }
        if(str.charAt(index) == ele) {
            if(first == -1) {
                first = index;
                last = index;
            } else {
                last = index;
            }
        }
        findFirstLast(str, ele, index + 1);
    }

    public static boolean checkSorted(int[] arr, int n) {
        if(n == arr.length - 1) {
            return true;
        }
        if(arr[n] > arr[n+1]) {
            return false;
        }
        return checkSorted(arr, n+1);
    }

    public static void moveAllX(String str, int n, String movedX, int xCount) {
        if(n == str.length()) {
            for(int i = 0; i < xCount; i++) {
                movedX += 'x';
            }
            System.out.println(movedX);
            return;
        }
        char currentChar = str.charAt(n);
        if(currentChar != 'x') {
            moveAllX(str, n+1, movedX + currentChar, xCount);
        } else {
            moveAllX(str, n+1, movedX, xCount + 1);
        }
    }

    public static boolean[] arr = new boolean[26];

    public static void removeDupe(String str, int n, String newStr) {
        if(n == str.length()) {
            System.out.println("New String: " + newStr);
            return;
        }
        char currChar = str.charAt(n);
        int index = currChar - 'a';
        if(!arr[index]) {
            // new element
            arr[index] = true;
            newStr += currChar;
        }
        removeDupe(str, n + 1, newStr);
    }

    public static void subsequence(String str, String newStr, int n) {
        if(n == str.length()) {
            System.out.print(newStr + " ");
            return;
        }
        char currentChar = str.charAt(n);
        subsequence(str, newStr + currentChar, n + 1);
        subsequence(str, newStr, n + 1);
    }

    public static void uniqueSubsequence(String str, String newStr, int n, HashSet<String> set) {
        if(n == str.length()) {
            if(set.contains(newStr)) {
                return;
            } else {
                System.out.print(newStr + " ");
                set.add(newStr);
            }
            return;
        }
        char currentChar = str.charAt(n);
        uniqueSubsequence(str, newStr + currentChar, n + 1, set);
        uniqueSubsequence(str, newStr, n+1, set);
    }

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombo(String str, int index, String combination) {
        if(index == str.length()) {
            System.out.print(combination + " ");
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];
        for(int i = 0; i < mapping.length(); i++) {
            printCombo(str, index + 1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // Print n fibonacci numbers
        printFib(0, 1, 6);
        drawLine();

        // Print x^n (stack height = n)
        // Stack height should be n
        // Calculate power
        int ans1 = calcPower(2, 5);
        System.out.println(ans1);
        drawLine();


        // Print x^n (stack height = logn)
        int ans2 = calcPower2(2, 5);
        System.out.println(ans2);
        drawLine();

        // Print Tower of Hanoi
        towerOfHanoi("A", "B", "C", 2);
        System.out.println("Time complexity: O(2^n) == (2^n - 1)");
        drawLine();

        // Print a string in reverse
        printRevString("Manik", 0);
        System.out.println();
        drawLine();

        // Find the first and last occurance of an element in a string
        findFirstLast("abaacdaefaah", 'a', 0);
        System.out.println("Time complexity: O(n) n -> length of string");
        drawLine();

        // Check if an array is sorted
        int[] arr = new int[]{1, 2, 3, 4, 5};
        if(checkSorted(arr, 0)) {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Unsorted");
        }
        System.out.println("Time complexity: O(n)");
        drawLine();

        // move all the 'x' to the end of the string
        moveAllX("xMxaxnxxixk", 0, "", 0);
        System.out.println("Time complexity: O(2n)");
        drawLine();

        // remove all duplicates in a string
        removeDupe("abbccda", 0, "");
        System.out.println("Time complexity: O(n)");
        drawLine();

        // print all the subsequences of a string
        subsequence("abc", "", 0);
        System.out.println("Time complexity: O(2^n) (using geometric progression)");
        drawLine();

        // print all the unique subsequence of a string
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence("aaa", "", 0, set);
        System.out.println("Time complexity: O(2^n) (using geometric progression)");
        drawLine();

        // print keypad combination
        printCombo("23", 0, "");
        System.out.println("Time complexity: O(4^n)"); 
        drawLine();
    }
}
