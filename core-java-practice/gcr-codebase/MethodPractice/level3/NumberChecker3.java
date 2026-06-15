public class NumberChecker3 {

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

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }

    public static int[][] frequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] digits = storeDigits(num);

        System.out.println("Sum Digits = " + sumDigits(digits));
        System.out.println("Sum Squares = " + sumSquares(digits));
        System.out.println("Harshad = " + isHarshad(num, digits));

        int[][] freq = frequency(digits);

        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
        }
    }
}