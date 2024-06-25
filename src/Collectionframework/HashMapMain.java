package Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {

        Map<String,String> hm = new HashMap<>();
        hm.put("Amit","Bangalore");
        hm.put("Rohan","Delhi");
        hm.put("uday","Mumbai");
        hm.put("uday","Mumbai");

        System.out.println(hm);
        System.out.println(hm.get("uday"));

       // 1. it will calculate hashcode(key)
       // 2. indexformethod calculate
       // 3. calculate equals method
    }
}
