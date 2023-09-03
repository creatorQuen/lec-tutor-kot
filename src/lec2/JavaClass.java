package lec2;

public class JavaClass {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getInstance();
//        singleton = Singleton.getInstance();

        JavaClass javaClass = new JavaClass();

        // nested
        //JavaClass.NestedJava nested = new JavaClass.NestedJava(4); //cannot be referenced from a static context
    }

    public JavaClass() {
        System.out.println("constructor called");
    }

    {
        System.out.println("some code done at start");
    }

    public class NestedJava {

        private final int s;

        public NestedJava(int s) {
            this.s = s;
        }
    }
}
