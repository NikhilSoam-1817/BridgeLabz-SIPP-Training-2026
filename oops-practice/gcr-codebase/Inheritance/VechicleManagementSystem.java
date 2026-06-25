
// Superclass Vehicle
class Vehicle {
    protected String model;
    protected double maxSpeed;
    
    public Vehicle(String model, double maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    
    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface Refuelable
interface Refuelable {
    void refuel();
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    private double batteryCapacity;
    
    public ElectricVehicle(String model, double maxSpeed, double batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }
    
    public void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass PetrolVehicle implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity;
    
    public PetrolVehicle(String model, double maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }
    
    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Tank capacity: " + fuelTankCapacity + " liters");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

public class VechicleManagementSystem {
    public static void main(String[] args) {
        // Create instances
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle BMW = new PetrolVehicle("BMW X5", 240, 83);
        
        // Display information
        System.out.println("=== Electric Vehicle ===");
        tesla.displayInfo();
        tesla.charge();
        
        System.out.println("\n=== Petrol Vehicle ===");
        BMW.displayInfo();
        BMW.refuel();
    }
}
