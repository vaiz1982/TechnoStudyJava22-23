package unit11.collections.day44.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> linkedHashIntegerSet
                = new LinkedHashSet<>(List.of(12, 43, 124, 124, 1234, 123, 412, 35, 234, 34, 234, 5));

        System.out.println(linkedHashIntegerSet);

        linkedHashIntegerSet.add(23);
        linkedHashIntegerSet.add(1);
        linkedHashIntegerSet.add(-99);

        System.out.println("-".repeat(30));
        System.out.println(linkedHashIntegerSet);
        System.out.println("-".repeat(30));

        System.out.println("Remove 1234: " + linkedHashIntegerSet.remove(1234));
        System.out.println(linkedHashIntegerSet);
        System.out.println("-".repeat(30));

        System.out.println("Remove -111: " + linkedHashIntegerSet.remove(-111));
        System.out.println(linkedHashIntegerSet);


    }
}
