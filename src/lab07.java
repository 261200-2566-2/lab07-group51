import java.util.*;
public class lab07 {
        public static void main(String[] args) {
            // Create an instance of your HSet
            HSet<String> hSet = new HSet<>();

            // Add elements to the set
            hSet.add("Apple");
            hSet.add("Banana");
            hSet.add("Orange");

            // Print the size of the set
            System.out.println("Size of the set: " + hSet.size());

            // Check if the set contains a specific element
            System.out.println("Contains 'Apple': " + hSet.contains("Apple"));
            System.out.println("Contains 'Grapes': " + hSet.contains("Grapes"));

            // Create another collection
            List<String> otherList = Arrays.asList("Banana", "Orange");

            // Add all elements from the collection to the set
            hSet.addAll(otherList);

            // Print the size of the set after adding elements from the collection
            System.out.println("Size of the set after adding elements from the collection: " + hSet.size());

            // Remove an element from the set
            hSet.remove("Banana");

            // Print the size of the set after removing an element
            System.out.println("Size of the set after removing an element: " + hSet.size());

            // Check if the set contains all elements from another collection
            System.out.println("Contains all elements from the collection: " + hSet.containsAll(otherList));

            // Retain only the elements in the set that are also in the other collection
            hSet.retainAll(otherList);

            // Print the size of the set after retaining elements
            System.out.println("Size of the set after retaining elements: " + hSet.size());

            // Remove all elements from the set that are in the other collection
            hSet.removeAll(otherList);

            // Print the size of the set after removing elements
            System.out.println("Size of the set after removing elements: " + hSet.size());

            // Check if the set is empty
            System.out.println("Is the set empty? " + hSet.isEmpty());

            // Clear the set
            hSet.clear();

            // Print the size of the set after clearing
            System.out.println("Size of the set after clearing: " + hSet.size());

        }
    }
