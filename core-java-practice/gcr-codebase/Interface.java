

// Regular Interface
interface Animal {
    void eat();
    void sleep();
}

// Functional Interface
@FunctionalInterface
interface Greeting {
    void sayHello();
}

// Marker Interface
interface Printable {
}

// Class implementing Regular and Marker Interfaces
class Dog implements Animal, Printable {

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {

        // Regular Interface
        Dog d = new Dog();
        d.eat();
        d.sleep();

        // Functional Interface using Lambda
        Greeting g = () -> System.out.println("Hello, Welcome!");
        g.sayHello();

        // Marker Interface check
        if (d instanceof Printable) {
            System.out.println("Dog class is Printable (Marker Interface).");
        }
    }
}























// interface Flyable {
//     void fly();
// }

// interface Swimmable {
//     void swim();
// }

// class Duck implements Flyable, Swimmable {

//     @Override
//     public void fly() {
//         System.out.println("Duck is flying");
//     }

//     @Override
//     public void swim() {
//         System.out.println("Duck is swimming");
//     }
// }