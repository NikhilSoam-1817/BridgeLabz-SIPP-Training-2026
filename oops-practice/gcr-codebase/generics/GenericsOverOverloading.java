package generics;

public class GenericsOverOverloading {
    
    // Generic method that works with any data type
    public static <T> void printElement(T element) {
        System.out.println("Element: " + element);
    }
    
    // Generic method that works with arrays of any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    
    // Generic method with bounded type parameter
    public static <T extends Number> double getDoubleValue(T number) {
        return number.doubleValue();
    }
    
    public static void main(String[] args) {
        // Using generic methods avoids overloading
        printElement(10);
        printElement("Hello");
        printElement(3.14);
        
        Integer[] intArray = {1, 2, 3};
        printArray(intArray);
        
        String[] stringArray = {"A", "B", "C"};
        printArray(stringArray);
        
        System.out.println(getDoubleValue(42));
        System.out.println(getDoubleValue(3.14f));
    }
}
