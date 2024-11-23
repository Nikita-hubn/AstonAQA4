

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    private final HashMap<String, ArrayList<String>> items = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        items.putIfAbsent(surname, new ArrayList<>());
        items.get(surname).add(phoneNumber);
    }

    public ArrayList<String> get(String surname) {
        return items.getOrDefault(surname, new ArrayList<>());
    }
}