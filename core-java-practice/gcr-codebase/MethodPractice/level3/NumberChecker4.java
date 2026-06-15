import java.util.Arrays;

public class NumberChecker4 {

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int num) {
        int n = countDigits(num);
        int[] digits = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverseArray(digits));
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 1221;

        int[] digits = storeDigits(num);

        System.out.println("Palindrome = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuck(digits));
    }
}