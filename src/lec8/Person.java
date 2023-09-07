package lec8;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int age;
    private final List<String> items = new ArrayList<>();

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public List<String> getItems() {
        //return items;
        return new ArrayList<>(items); // DEFENSIVE COPY
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", items=" + items +
                '}';
    }
}
