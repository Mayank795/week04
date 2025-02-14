package Collectionframework.listinterface.findfrequnecy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frequency {

   public static Map freque(List<String> words){
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i< words.size();i++){
            map.put(words.get(i),map.getOrDefault(words.get(i),0)+1 );
        }

        System.out.println(map);
       return map;
    }
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apple");
        words.add("banana");
        words.add("orange");

        freque(words);


    }
}
