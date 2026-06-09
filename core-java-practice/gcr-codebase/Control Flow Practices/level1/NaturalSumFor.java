import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n >= 1) {

            int sum = 0;

            for (int i = 1; i <= n; i++) {

                sum = sum + i;
            }

            int formula =
                    n * (n + 1) / 2;

            System.out.println(
                    "For Loop Sum = " + sum);

            System.out.println(
                    "Formula Sum = " + formula);

            System.out.println(
                    "Both are equal? " +
                    (sum == formula));
        }
        else {

            System.out.println(
                    "Not a natural number");
        }

        input.close();
    }
}