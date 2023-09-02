package lec1;

import java.util.ArrayList;
import java.util.List;

public class MyMain {

    public static <T> List<T> singletonList(T object) {
        List<T> list = new ArrayList<>(1);
        list.add(object);
        return list;
    }
}
