package unit11.collections.day45.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ViewCollectionsOfMap {
    public static void main(String[] args) {
        Map<String, Integer> integerMap
                = new HashMap<>(Map.of("A", 29, "T", 61, "I", 34, "Y", 29, "Z", 56, "X", 11));
        System.out.println(integerMap);

        System.out.println("-".repeat(100));
        Set<String> stringSet = new HashSet<>();
        stringSet = integerMap.keySet();
        /*System.out.println("Set of the Keys: " + integerMap.keySet());*/
        System.out.println("Set of the Keys: " + stringSet);

        System.out.println("-".repeat(100));
        System.out.println("Collection of the Values: " + integerMap.values());

        System.out.println("-".repeat(100));
        System.out.println("Set of the entries: " + integerMap.entrySet());



    }
}
