package unit11.collections.day43.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetIntegersExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        System.out.println(integerSet.add(7));
        System.out.println("-".repeat(20));
        System.out.println(integerSet);
        System.out.println(integerSet.add(9));
        System.out.println("-".repeat(20));
        System.out.println(integerSet);
        System.out.println(integerSet.add(15));
        System.out.println("-".repeat(20));
        System.out.println(integerSet);
        System.out.println(integerSet.add(7));
        System.out.println("-".repeat(20));
        System.out.println(integerSet);
        System.out.println(integerSet.add(11));
        System.out.println("-".repeat(20));
        System.out.println(integerSet);
        System.out.println(integerSet.add(11));
        System.out.println("-".repeat(20));
        System.out.println(integerSet);

        System.out.println("Does it contain 9? " + integerSet.contains(9));
        System.out.println("Does it contain 33? " + integerSet.contains(33));

        System.out.println("Remove 55." + integerSet.remove(55));
        System.out.println(integerSet);

        System.out.println("Remove 7." + integerSet.remove(7));
        System.out.println(integerSet);

    }
}
