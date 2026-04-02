package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetLearn {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // 🔹 Add elements
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(2); // duplicate (ignore hoga)

        System.out.println("Set: " + set);

        // 🔹 Remove element
        set.remove(54);
        System.out.println("After remove: " + set);

        // 🔹 Check element present or not
        System.out.println("Contains 21? " + set.contains(21));

        // 🔹 Check empty
        System.out.println("Is Empty? " + set.isEmpty());

        // 🔹 Size
        System.out.println("Size: " + set.size());
    }
}