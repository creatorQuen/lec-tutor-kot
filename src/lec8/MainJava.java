package lec8;

public class MainJava {

    public static void main(String[] args) {
        Person person = new Person();
        person.addItem("one");
        person.addItem("two");
        person.addItem("three");
        System.out.println(person.toString());

        person.getItems().set(0, "new");
        person.getItems().set(0, "new");
        person.getItems().set(0, "new");
        System.out.println(person.toString());
    }
}
