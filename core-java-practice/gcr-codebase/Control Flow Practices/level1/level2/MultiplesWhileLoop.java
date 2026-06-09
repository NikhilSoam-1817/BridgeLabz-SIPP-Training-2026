import java.util.Scanner;

public class MultiplesWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int counter = 100;

        if (number > 0 && number < 100) {

            System.out.println("Multiples below 100 are:");

            while (counter >= 1) {

                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--;
            }
        }
        else {

            System.out.println(
                    "Enter positive number less than 100");
        }

        input.close();
    }
}