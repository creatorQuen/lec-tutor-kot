package lec8;

import java.util.ArrayList;
import java.util.List;

public class JavaClass {

    private static List<Integer> getNewList(List<Integer> source) {
        List<Integer> positive = new ArrayList<>();
        for (int i : source) {
            if (i > 0) {
                positive.add(i);
            }
        }
        return positive;
    }

    public static List<String> getMappedList(List<Integer> source, String prefix) {
        List<String> result = new ArrayList<>();
        for (int i : source) {
            result.add(prefix + i);
        }
        return result;
    }
}
