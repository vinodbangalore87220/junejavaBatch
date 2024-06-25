package Collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collectionFramework {
    public static void main(String[] args) {
        List<String> st = new ArrayList<>();
        st.add("anuj");
        st.add("rohan");
        st.add("rohan");

        System.out.println(st);

        Set<String> set = new HashSet<>();
        set.add("anuj");
        set.add("rohan");
        set.add("rohan");

        System.out.println(set);
    }
}
