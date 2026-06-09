import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {

            System.out.print("Enter number: ");
            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

            total = total + number;
        }

        System.out.println("Total = " + total);

        input.close();
    }
}