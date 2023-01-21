package unit11.collections.day45.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapEntryMethods {
    public static void main(String[] args) {
        Map<String, Integer> integerMap
                = new HashMap<>(Map.of("A", 29, "T", 61, "I", 34, "Y", 29, "Z", 56, "X", 11));
        System.out.println("Map: " + integerMap);

        Set<Map.Entry<String, Integer>> entrySet
                = new HashSet<>();
        entrySet = integerMap.entrySet();
        System.out.println("Set of Entries: " + entrySet);

        for (Map.Entry<String, Integer> entry:entrySet) {
            System.out.println(entry);
        }

        for (Map.Entry<String, Integer> entry:entrySet) {
            System.out.println("Entry: " +entry);
            System.out.println("Key of the Entry: " +entry.getKey());
            System.out.println("Value of the entry: " + entry.getValue() );
        }

        System.out.println("Printing the Entries with value greater than 40");
        for (Map.Entry<String, Integer> entry : entrySet){
            if(entry.getValue() > 40){
                System.out.println(entry);
            }
        }

        System.out.println("Printing the Entries with the key either A or Z");
        for (Map.Entry<String, Integer> entry : entrySet){
            if(entry.getKey().equals("A")||entry.getKey().equals("Z")){
                System.out.println(entry);
            }
        }

    }
}
