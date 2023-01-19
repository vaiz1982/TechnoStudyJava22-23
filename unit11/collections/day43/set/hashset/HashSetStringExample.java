package unit11.collections.day43.set.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetStringExample {
    public static void main(String[] args) {
        Set<String> stringSet
                = new HashSet<>(List.of("A", "B", "X", "B", "C", "Y"));

        System.out.println(stringSet);
        stringSet.add("S");
        System.out.println(stringSet);
        stringSet.add("Z");
        System.out.println(stringSet);
        stringSet.remove("X");
        System.out.println(stringSet);
        System.out.println(stringSet.contains("Z"));
    }
}
