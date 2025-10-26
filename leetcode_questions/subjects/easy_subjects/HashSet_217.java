import java.util.HashSet;

public class HashSet_217 {
    public static void main(String[] args) {

        // 1️⃣ Example: Duplicate elements cannot be added
        HashSet<String> names = new HashSet<>();
        names.add("Mehmet");  // true
        names.add("Mike");    // true
        names.add("Jessica"); // true
        names.add("Mehmet");  // false, "Mehmet" is already added

        System.out.println("Names HashSet:");
        for(String name : names ){
            System.out.println("- " + name);
        }
        System.out.println("------------------------------------------------------------------ ");

        // 2️⃣ Example: Generic type mismatch
        HashSet<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mercedes");
        // cars.add(15); // ERROR: Type mismatch, Integer cannot be added to String HashSet
        for (String car : cars){
            System.out.println("-" + car);
        }
        System.out.println("------------------------------------------------------------------ ");

        // 3️⃣ Example: Using Object generic to store all types
        HashSet<Object> obj = new HashSet<>();
        obj.add(12);        // Integer
        obj.add("12 str");  // String
        obj.add(12.0);      // Double
        obj.add(false);     // Boolean
        obj.add(null);      // null

        System.out.println("Object HashSet:");
        for(Object object : obj){
            System.out.println("- " + object);
        }
        System.out.println("------------------------------------------------------------------ ");

        // 4️⃣ Example: clear() method to remove all elements
        HashSet<String> animals = new HashSet<>();
        animals.add("mouse");
        animals.add("dog");
        animals.add("cat");

        System.out.println("Animals HashSet before clear:");
        for (String animal : animals){
            System.out.println("- " + animal);
        }

        animals.clear(); // All elements are removed
        System.out.println("Animals HashSet after clear: " + animals);
        System.out.println("------------------------------------------------------------------ ");

        // 5️⃣ Example: remove() method to delete a specific element
        HashSet<String> authors = new HashSet<>();
        authors.add("John Verdon");
        authors.add("Adam Fawer");
        authors.add("Dan Brown");

        System.out.println("Authors HashSet before remove:");
        for (String author : authors){
            System.out.println("- " + author);
        }

        authors.remove("Adam Fawer"); // Removes existing element
        authors.remove("John");        //Element not present, so nothing is removed
        authors.remove(0); // This does NOT remove the first element like in a List. HashSet has no index.

        System.out.println("Authors HashSet after remove: " + authors);
    }
}
