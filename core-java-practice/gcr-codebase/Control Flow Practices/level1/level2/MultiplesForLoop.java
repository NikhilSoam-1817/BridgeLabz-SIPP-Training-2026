import java.util.Scanner;

public class MultiplesForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {

            System.out.println("Multiples below 100 are:");

            for (int i = 100; i >= 1; i--) {

                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        else {

            System.out.println(
                    "Enter positive number less than 100");
        }

        input.close();
    }
}