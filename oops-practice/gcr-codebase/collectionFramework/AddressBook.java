import java.util.*;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number!");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);
    }

    static void search(String name) {
        Contact c = map.get(name);
        if (c != null)
            System.out.println(c.name + " " + c.phone + " " + c.email);
        else
            System.out.println("Contact not found");
    }

    static void delete(String name) {
        Contact c = map.remove(name);

        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Deleted");
        } else
            System.out.println("Contact not found");
    }

    static void display() {
        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        for (Contact c : contacts)
            System.out.println(c.name + " " + c.phone + " " + c.email);
    }

    public static void main(String[] args) {

        addContact("Nikhil", "9876543210", "nikhil@gmail.com");
        addContact("Aman", "9123456789", "aman@gmail.com");
        addContact("Riya", "9876543210", "riya@gmail.com");

        search("Aman");

        delete("Nikhil");

        display();
    }
}