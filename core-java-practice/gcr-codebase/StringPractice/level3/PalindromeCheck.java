import java.util.Scanner;

public class PalindromeCheck {

    public static boolean palindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean palindromeRecursive(String text,
                                              int start,
                                              int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return palindromeRecursive(text,
                start + 1,
                end - 1);
    }

    public static char[] reverseArray(String text) {

        char[] reverse = new char[text.length()];

        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }

        return reverse;
    }

    public static boolean palindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseArray(text);

        for (int i = 0; i < original.length; i++) {

            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println("Loop Method: "
                + palindromeLoop(text));

        System.out.println("Recursive Method: "
                + palindromeRecursive(text, 0,
                text.length() - 1));

        System.out.println("Array Method: "
                + palindromeArray(text));
    }
}