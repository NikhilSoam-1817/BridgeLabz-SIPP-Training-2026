import java.util.List;
import java.util.ArrayList;

public class avoidUsingRawTypes {
    
   

    public void processTypedList(List<String> list) {
        list.add("item");
        String item = list.get(0); // No cast needed
        System.out.println(item);
    }
    

    public List<Integer> createTypedList() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        return numbers;
    }
    
   
    public void processMap(java.util.Map<String, Integer> map) {
        map.put("count", 5);
        Integer value = map.get("count"); // Type-safe
    }
    
    public static void main(String[] args) {
        avoidUsingRawTypes demo = new avoidUsingRawTypes();
        
        // Using parameterized types
        List<String> strings = new ArrayList<String>();
        demo.processTypedList(strings);
        
        List<Integer> nums = demo.createTypedList();
        System.out.println(nums);
    }
}
