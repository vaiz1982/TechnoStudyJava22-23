package unit11.collections.day45.map;

import java.util.HashMap;
import java.util.Map;

public class MapExamplesAndMethods {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap
                = new HashMap<>();
        Map<String, Integer> integerMap
                = new HashMap<>(Map.of("A", 12, "T", 61, "I", 34, "Y", 29));
        /**In initialization, it throws an exception
         * if you try to add duplicate keyed entry*/
        System.out.println(integerMap);

        System.out.println("\nPut <B , 16> : return -> " + integerMap.put("B", 16));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nPut <A , 6> : return -> " + integerMap.put("A", 6));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nPutIfAbsent <K , 41> : return -> " + integerMap.putIfAbsent("K", 41));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nPutIfAbsent <K , 111> : return -> " + integerMap.putIfAbsent("K", 111));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));


        System.out.println("\nGet <I> : return -> " + integerMap.get("I"));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nGet <X> : return -> " + integerMap.get("X"));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nGetOrDefault <I> : return -> " + integerMap.getOrDefault("I", -99));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nGetOrDefault <X> : return -> " + integerMap.getOrDefault("X", -99));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nContainsKey <I> : return -> " + integerMap.containsKey("I"));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nContainsKey <X> : return -> " + integerMap.containsKey("X"));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nContainsValue <-1> : return -> " + integerMap.containsValue(-1));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nContainsValue <34> : return -> " + integerMap.containsValue(34));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nRemove <Y> : return -> " + integerMap.remove("Y"));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nRemove <Y> : return -> " + integerMap.remove("Y"));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nRemove <A, 6> : return -> " + integerMap.remove("A", 6));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nRemove <I, 35> : return -> " + integerMap.remove("I", 35));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nReplace <K, 99> : return -> " + integerMap.replace("K", 99));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nReplace <X, 99> : return -> " + integerMap.replace("X", 99));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nReplace <K, 99, 41> : return -> " + integerMap.replace("K", 99, 41));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));

        System.out.println("\nReplace <K, 99, 33> : return -> " + integerMap.replace("K", 99, 33));
        System.out.println("-".repeat(100));
        System.out.println(integerMap);
        System.out.println("-".repeat(100));
    }
}
