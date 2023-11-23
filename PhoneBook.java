//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class PhoneBook {

    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        List<String> phones = phoneBook.get(name);
        if (phones == null) {
            phones = new ArrayList<>();
        }
        phones.add(phone);
        phoneBook.put(name, phones);
    }

    public void print() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван Иванов", "123-45-67");
        phoneBook.add("Иван Иванов", "765-43-21");
        phoneBook.add("Петр Петров", "987-65-43");
        phoneBook.add("Иван Иванов", "867-99-05");
        phoneBook.add("Петр Петров", "321-45-67");
        phoneBook.add("Кузьма Кузьмич", "321-45-67");
        phoneBook.add("Иван", "765-43-21");
        phoneBook.add("Петр Петров", "321-45-67");
        phoneBook.add("Петр", "321-45-67");
        phoneBook.print();
    }
}