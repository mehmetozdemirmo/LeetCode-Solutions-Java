package easy_subjects;

import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {

        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> animalNum = new HashMap<>();

        // Add initial entries
        animalNum.put("CAT", 15);
        animalNum.put("DOG", 3);
        animalNum.put("LION", 4);

        // Print all entries
        System.out.println("Initial values:");
        for (String name : animalNum.keySet()) {
            System.out.println("Name: " + name + " Count: " + animalNum.get(name));
        }

        // Add new entry and update existing one
        animalNum.put("lion", 23); // new key (case-sensitive)
        animalNum.put("CAT", 2);   // updates existing value

        // Print updated entries
        System.out.println("\nUpdated values:");
        for (String name2 : animalNum.keySet()) {
            System.out.println("Name: " + name2 + " Count: " + animalNum.get(name2));
        }
    }
}
