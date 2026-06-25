class Vehicle{
    void fuelCost(int km){
        System.out.println("Cost");
    }
}
class Car extends Vehicle{
    @Override
    void fuelCost(int km){
        System.out.println(km*8);
    }
}
class Bus extends Vehicle{
    @Override
    void fuelCost(int km){
        System.out.println(km*15);
    }
}
class Bike extends Vehicle{
    @Override
    void fuelCost(int km){
        System.out.println(km*3);
    }
}
public class Main{
    public static void main(String[] args){
        Vehicle[] v={
            new Car(),
            new Bus(),
            new Bike()
        };

        for(Vehicle x:v)
            x.fuelCost(10);
    }
}