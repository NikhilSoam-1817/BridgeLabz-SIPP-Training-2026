
// Build an Address Book Management Systen that stores contact detalls such as, photo, and email address. Design the application using miltiple on Collections to al storage, searching, and duplicate prevention. Your progres should support the fallanding functionalities:

// Store all contacts in an ArrayList to seletada an ordered list.

// Use a Hashmap<strind,contact>, for quick lookup of contacts by me.

// - Use a HashSet<String >to  ensure that dublicate phone cannot be added.

// Implament functionality to add, search, delete, and display contacts.
//  Display all contacts sorted alphabetically by name using Collections.sort().

// Ensure that shenever a contact is added or deleted, all these collections raada sadewind and contain consist

import java.util.*;

public class AddressBookManagementSystem {

  private final List<Contact> contacts = new ArrayList<>();
  private final Map<String, Contact> contactsByName = new HashMap<>();
  private final Set<String> usedPhoneNumbers = new HashSet<>();

  public boolean addContact(String name, String phoneNumber, String email, String photo) {
    if (name == null || phoneNumber == null || email == null) {
      return false;
    }


    String tName = name.trim();
    String tPhone = phoneNumber.trim();
    String tEmail = email.trim();
    String tPhoto = photo == null ? "" : photo.trim();

    String normalizedName = normalize(tName);
    String normalizedPhone = normalize(tPhone);

    if (normalizedName.isEmpty() || normalizedPhone.isEmpty()) {
      return false;
    }

    if (contactsByName.containsKey(normalizedName) || usedPhoneNumbers.contains(normalizedPhone)) {
      return false;
    }

    Contact contact = new Contact(tName, tPhone, tEmail, tPhoto);
    contacts.add(contact);
    contactsByName.put(normalizedName, contact);
    usedPhoneNumbers.add(normalizedPhone);
    return true;
  }

  public Contact searchName(String name) {
    if (name == null) {
      return null;
    }
    return contactsByName.get(normalize(name));
  }

  public boolean deleteContact(String name) {
    if (name == null) {
      return false;
    }

    String normalizedName = normalize(name);
    Contact contact = contactsByName.remove(normalizedName);
    if (contact == null) {
      return false;
    }

    contacts.remove(contact);
    usedPhoneNumbers.remove(normalize(contact.getPhoneNumber()));
    return true;
  }

  public List<Contact> displayContacts() {
    List<Contact> sortedContacts = new ArrayList<>(contacts);
    Collections.sort(sortedContacts, Comparator.comparing(Contact::getName, String.CASE_INSENSITIVE_ORDER));
    return sortedContacts;
  }

  public int size() {
    return contacts.size();
  }

  private String normalize(String value) {
    return value == null ? "" : value.trim().toLowerCase();
  }

  public static final class Contact {
    private final String name;
    private final String phoneNumber;
    private final String email;
    private final String photo;

    public Contact(String name, String phoneNumber, String email, String photo) {
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.photo = photo;
    }

    public String getName() {
      return name;
    }

    public String getPhoneNumber() {
      return phoneNumber;
    }

    public String getEmail() {
      return email;
    }

    public String getPhoto() {
      return photo;
    }

    @Override
    public String toString() {
      return "Contact{" +
          "name='" + name + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          ", email='" + email + '\'' +
          ", photo='" + photo + '\'' +
          '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o)
        return true;
      if (!(o instanceof Contact))
        return false;
      Contact contact = (Contact) o;
      return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, phoneNumber);
    }
  }
}













































































// import java.util.*;

// public class AddressBookManagementSystem {

// 	// Simple contact representation
// 	public static class Contact implements Comparable<Contact> {
// 		public String name;
// 		public String phone;
// 		public String email;
// 		public String photoPath; // path or url

// 		public Contact(String name, String phone, String email, String photoPath) {
// 			this.name = name;
// 			this.phone = phone;
// 			this.email = email;
// 			this.photoPath = photoPath;
// 		}

// 		@Override
// 		public int compareTo(Contact o) {
// 			if (o == null) return 1;
// 			if (this.name == null && o.name == null) return 0;
// 			if (this.name == null) return -1;
// 			if (o.name == null) return 1;
// 			return this.name.compareToIgnoreCase(o.name);
// 		}

// 		@Override
// 		public String toString() {
// 			return (name == null ? "" : name) + " | " + (phone == null ? "" : phone)
// 					+ " | " + (email == null ? "" : email) + " | " + (photoPath == null ? "" : photoPath);
// 		}
// 	}

// 	// Collections to keep contacts consistent
// 	private final List<Contact> list = new ArrayList<>();
// 	private final Map<String, Contact> byName = new HashMap<>();
// 	private final Set<String> phones = new HashSet<>();

// 	// Add contact: prevents duplicate phone numbers and duplicate names
// 	public boolean addContact(Contact c) {
// 		synchronized (this) {
// 			if (c == null || c.phone == null || c.name == null) return false;
// 			if (phones.contains(c.phone)) return false; // duplicate phone
// 			if (byName.containsKey(c.name)) return false; // duplicate name

// 			list.add(c);
// 			byName.put(c.name, c);
// 			phones.add(c.phone);
// 			return true;
// 		}
// 	}

// 	// Search by name (exact)
// 	public Contact searchByName(String name) {
// 		if (name == null) return null;
// 		return byName.get(name);
// 	}

// 	// Delete by name
// 	public boolean deleteByName(String name) {
// 		synchronized (this) {
// 			Contact c = byName.remove(name);
// 			if (c == null) return false;
// 			phones.remove(c.phone);
// 			list.remove(c);
// 			return true;
// 		}
// 	}

// 	// Display all contacts sorted by name
// 	public List<Contact> getAllSorted() {
// 		List<Contact> copy;
// 		synchronized (this) {
// 			copy = new ArrayList<>(list);
// 		}
// 		Collections.sort(copy);
// 		return copy;
// 	}

// }
