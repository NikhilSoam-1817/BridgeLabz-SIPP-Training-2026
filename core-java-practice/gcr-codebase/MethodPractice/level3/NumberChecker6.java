public class NumberChecker6 {

    public static int divisorSum(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }

        return sum;
    }

    public static boolean isPerfect(int n) {
        return divisorSum(n) == n;
    }

    public static boolean isAbundant(int n) {
        return divisorSum(n) > n;
    }

    public static boolean isDeficient(int n) {
        return divisorSum(n) < n;
    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    public static boolean isStrong(int n) {
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int num = 145;

        System.out.println("Perfect = " + isPerfect(num));
        System.out.println("Abundant = " + isAbundant(num));
        System.out.println("Deficient = " + isDeficient(num));
        System.out.println("Strong = " + isStrong(num));
    }
}