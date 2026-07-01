import java.util.*;

public class AttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> list = attendance.get(subject);

        if (!list.contains(student)) {
            list.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate attendance not allowed");
        }
    }

    static void display() {

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject: " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String s : students)
                System.out.println(s);

            System.out.println("Total Students = " + students.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Nikhil");
        markAttendance("Java", "Aman");
        markAttendance("Java", "Nikhil");

        markAttendance("Python", "Riya");
        markAttendance("Python", "Rahul");

        display();
    }
}