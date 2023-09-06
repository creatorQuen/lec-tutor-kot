package lec5;

public class AJava {

    private final String a;
    private final int b;

    public AJava(String a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "AJava{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }
}
