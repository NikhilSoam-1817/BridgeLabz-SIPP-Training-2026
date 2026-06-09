import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int counter = 1;

        if (number > 0) {

            System.out.println("Factors are:");

            while (counter < number) {

                if (number % counter == 0) {
                    System.out.println(counter);
                }

                counter++;
            }
        }
        else {

            System.out.println("Not a Positive Integer");
        }

        input.close();
    }
}