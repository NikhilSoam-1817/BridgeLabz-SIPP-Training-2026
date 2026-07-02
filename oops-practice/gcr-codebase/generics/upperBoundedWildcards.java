

import java.util.ArrayList;
import java.util.List;

public class upperBoundedWildcards {
    
    
    public static void readNumbers(List<? extends Number> numbers) {
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
    
    // Another example: ? extends Object
    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // Works with List<Integer>
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        readNumbers(integers);
        
        // Works with List<Double>
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(2.5);
        doubles.add(3.5);
        readNumbers(doubles);
        
        System.out.println("Sum of integers: " + sumNumbers(integers));
        System.out.println("Sum of doubles: " + sumNumbers(doubles));
    }
}
