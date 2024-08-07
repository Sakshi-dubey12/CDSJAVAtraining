import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store the entries
        Map<String, Integer> people = new HashMap<>();

        // Add entries with the same name but different ages
        addPerson(people, "wani", 5);
        addPerson(people, "wani", 25);


        // Print the HashMap
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }

    private static void addPerson(Map<String, Integer> map, String name, int age) {
        // Create a unique key by combining the name with a counter
        String key = name;
        int counter = 1;

        // Increment the counter if the key already exists
        while (map.containsKey(key)) {
            key = name +  counter;
            counter++;
        }

        // Add the entry to the map
        map.put(key, age);
    }
}
