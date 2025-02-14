package Collectionframework.listinterface.reverse;

import java.util.ArrayList;
import java.util.List;

public class reversearraylist {

    public static void reverse(List<Integer> numbers){
        int left = 0, right = numbers.size() - 1;
        while (left < right) {
            // Swap elements
            int temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);

            left++;
            right--;
        }
    }
    public static void main(String[] args) {

                List<Integer> numbers = new ArrayList<>();
                numbers.add(10);
                numbers.add(20);
                numbers.add(30);
                numbers.add(40);
                numbers.add(50);

                System.out.println("Original List: " + numbers);

                reverse(numbers);

                System.out.println("Reversed List: " + numbers);
            }
        }



