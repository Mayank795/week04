package Collectionframework.setinterface;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        // Create a HashSet with integers
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Convert HashSet to List
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort the List in ascending order
        Collections.sort(sortedList);

        // Print Result
        System.out.println("Sorted List: " + sortedList);
    }
}
