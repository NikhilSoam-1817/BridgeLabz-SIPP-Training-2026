import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        
        HashMap<String, Integer> marks = new HashMap<>();

       
        marks.put("Nikhil", 95);
        marks.put("Raj", 88);
        marks.put("Riya", 91);

        
        System.out.println(marks);
        System.out.println(marks.get("Nikhil"));
        
       

    
       

    }
}