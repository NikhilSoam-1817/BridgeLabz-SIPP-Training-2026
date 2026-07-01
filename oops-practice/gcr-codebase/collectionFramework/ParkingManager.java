import java.util.*;

public class ParkingManager {

    static ArrayList<String> vehicles = new ArrayList<>();

    static void enterVehicle(String number) {
        vehicles.add(number);
        System.out.println(number + " Entered");
    }

    static void exitVehicle(String number) {
        if (vehicles.remove(number))
            System.out.println(number + " Exited");
        else
            System.out.println("Vehicle not found");
    }

    static void searchVehicle(String number) {
        if (vehicles.contains(number))
            System.out.println("Vehicle is parked");
        else
            System.out.println("Vehicle not found");
    }

    static void display() {
        System.out.println("Parked Vehicles:");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots = " + vehicles.size());
    }

    public static void main(String[] args) {

        enterVehicle("UP14AB1234");
        enterVehicle("DL10CD5678");

        searchVehicle("UP14AB1234");

        exitVehicle("DL10CD5678");

        display();
    }
}