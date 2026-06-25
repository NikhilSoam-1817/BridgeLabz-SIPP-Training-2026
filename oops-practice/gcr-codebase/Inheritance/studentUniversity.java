

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {
    private final String studentId;
    private double gpa;
    
    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "base=" + super.toString() +
                ", studentId='" + studentId + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

class GradStudent extends Student {
    private String thesis;
    
    public GradStudent(String name, int age, String studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }
    
    @Override
    public String toString() {
        return "GradStudent{" +
                "base=" + super.toString() +
                ", thesis='" + thesis + '\'' +
                '}';
    }
}

public class studentUniversity {
    public static void main(String[] args) {
        Person person = new Person("John", 50);
        System.out.println(person);
        
        Student student = new Student("Alice", 20, "S001", 3.8);
        System.out.println(student);
        
        GradStudent gradStudent = new GradStudent("Bob", 25, "G001", 3.9, "AI in Education");
        System.out.println(gradStudent);
        
        // Demonstrate IS-A relationships
        System.out.println("\n--- IS-A Relationships ---");
        System.out.println("GradStudent IS-A Student: " + (gradStudent instanceof Student));
        System.out.println("GradStudent IS-A Person: " + (gradStudent instanceof Person));
        System.out.println("Student IS-A Person: " + (student instanceof Person));
    }
}
