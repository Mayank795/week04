package Collectionframework.listinterface.reverse;

import java.util.LinkedList;
import java.util.List;

public class reverseLinkedlist {
    public static void reverselist(List<Integer> list){
        int  left=0,right= list.size()-1;

        while(left<right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Orignal list "+list);

        System.out.println("Reversed list "+list);

    }
}
