

import java.util.ArrayList;
import java.util.List;

public class lowerBoundedWildcards {

    public static <T> void addValue(List<? super T> destination, T value) {
        destination.add(value);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addValue(numberList, 42);
        addValue(objectList, 42);

        printList(numberList);
        printList(objectList);
    }

    private static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
