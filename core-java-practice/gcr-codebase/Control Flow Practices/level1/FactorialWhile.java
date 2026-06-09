import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number >= 1) {

            int factorial = 1;
            int i = 1;

            while (i <= number) {

                factorial = factorial * i;
                i++;
            }

            System.out.println(
                    "Factorial = " +
                    factorial);
        }
        else {

            System.out.println(
                    "Not a positive integer");
        }

        input.close();
    }
}