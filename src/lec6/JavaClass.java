package lec6;

public class JavaClass {
    public static void main(String[] args) {
        C c = new C(new AImpl(), new BImpl());
        c.doOne();
        c.doTwo();
        c.doThree();

        System.out.println("\n");
        CC cc = new CC(11);
        cc.doOne();
    }
}
