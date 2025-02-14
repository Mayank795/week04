package Collectionframework.listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeDuplicate {

    public static void remove(List<Integer> list){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i< list.size();i++){
            if(!(set.contains(list.get(i)))){
                set.add(list.get(i));
            }
            else{
                list.remove(i);
                i--;
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(2);

        System.out.println("Original list :"+list);

       remove(list);

        System.out.println("updated list :"+ list);

    }
}
