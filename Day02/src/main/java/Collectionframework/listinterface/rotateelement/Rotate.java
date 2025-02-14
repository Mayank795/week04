package Collectionframework.listinterface.rotateelement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotate {

    public static void rotate(List<Integer> list){
        int pos = 2;
        int i=0;
        while(pos!=0){
            int temp = list.get(i);
            list.remove(i);
            list.add(list.size(),temp);
            pos--;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list "+list);

        rotate(list);

        System.out.println("Rotated list "+list);

    }
}
