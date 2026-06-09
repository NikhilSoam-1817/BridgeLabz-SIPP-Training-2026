import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony age: ");
        int anthonyAge = input.nextInt();

        System.out.print("Enter Amar height: ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar height: ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony height: ");
        double anthonyHeight = input.nextDouble();

        // Youngest
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest");
        }
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest");
        }
        else {
            System.out.println("Anthony is the youngest");
        }

        // Tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest");
        }
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest");
        }
        else {
            System.out.println("Anthony is the tallest");
        }

        input.close();
    }
}