package lec7.three;

import java.util.ArrayList;
import java.util.List;

public class BeJava {
    // with
//    A a = new AImpl();
//    a.do1();
//    a.do1();

    // let
//    A a =new AImpl();
//    a.do2();
//    new B().doSome(a);

    // apply
    private static List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        return list;
    }

    // run
    public static void main(String[] args) {
        final A a = null;
        if (a != null) {
            a.do1();
            a.do2();
        }
    }
}
