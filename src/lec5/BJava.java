package lec5;

import java.util.HashMap;
import java.util.Map;

public class BJava {

    public static void main(String[] args) {
        Map<Integer, AJava> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, new AJava(i + "", i * 10));
        }

        map.put(null, new AJava(null, -2));

        System.out.println(map.get(7));
        System.out.println(map.get(null));

        for(Map.Entry<Integer,AJava> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + " " + entrySet.getValue());
        }

        //
        AJava a = new AJava("", 90);
        AJava b = new AJava("", 90);
        System.out.println(a == b); // false

        AJava c = a;
        System.out.println(a == c); // true


        // hash table

    }
}
