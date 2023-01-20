package unit11.collections.day44.set.treeset;

import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(123,4123,4,1234,124,123,41,234,1));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("add: 20: " + integerTreeSet.add(20));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("remove: 4123: " + integerTreeSet.remove(4123));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("first element: " + integerTreeSet.first());
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("last element: " + integerTreeSet.last());
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("poll first: " + integerTreeSet.pollFirst());
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("poll last: " + integerTreeSet.pollLast());
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));

        System.out.println("ceiling of 100: " + integerTreeSet.ceiling(100));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("ceiling of 41 (41 is in the list already): " + integerTreeSet.ceiling(41));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("higher of 41 (41 is in the list already): " + integerTreeSet.higher(41));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("higher of 250: " + integerTreeSet.higher(250));
        System.out.println("Since nothing is higher than 250 it gives null back");
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("floor of 100: " + integerTreeSet.floor(100));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("floor of 124 (124 is in the list): " + integerTreeSet.floor(124));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("lower of 124 (124 is in the list): " + integerTreeSet.lower(124));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("subset between 100 and 200: " + integerTreeSet.subSet(100, 200));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("subset between 20 and 124 (they are both in the list): " + integerTreeSet.subSet(20,124));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("subset between 20 and 124 (using overloaded subset): "
        + integerTreeSet.subSet(20, true, 124, true));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));

        System.out.println("tail set starting from 100: "
        + integerTreeSet.tailSet(100));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));

        System.out.println("tail set starting from 41 (41 is in the list): "
        +integerTreeSet.tailSet(41));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));
        System.out.println("tail set starting from 41 (overloaded version): "
        +integerTreeSet.tailSet(41, false));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));

        System.out.println("head set till 100: " + integerTreeSet.headSet(100));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));

        System.out.println("head set till 123 (123 is in the list): "
        + integerTreeSet.headSet(123));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));

        System.out.println("head set till 123 (overloaded version): "
        + integerTreeSet.headSet(123,true));
        System.out.println(integerTreeSet);
        System.out.println("-".repeat(100));

    }
}
