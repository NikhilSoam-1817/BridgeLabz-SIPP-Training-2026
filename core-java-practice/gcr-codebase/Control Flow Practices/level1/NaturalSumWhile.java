import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n >= 1) {

            int sum = 0;
            int i = 1;

            while (i <= n) {

                sum = sum + i;
                i++;
            }

            int formula =
                    n * (n + 1) / 2;

            System.out.println(
                    "While Loop Sum = " + sum);

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