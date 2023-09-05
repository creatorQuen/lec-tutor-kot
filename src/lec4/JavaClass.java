package lec4;

public class JavaClass {

    public void forCond() {
        boolean breakOuter = false;
        for (int i = 0; i < 3; i++) {
            if (breakOuter)
                break;
            System.out.println("i: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("j: " + j);
                if (j == 1) {
                    breakOuter = true;
                    break;
                }
            }
        }
    }

    public void soSome(int max) {
        boolean successful = true;
        for (int i =0; i < max; i++) {
            if (i == 3) {
                successful = false;
                break;
            }
        }
        if (successful) {
            System.out.println("all done");
        }
    }

    public void arrayObjects() {
        Object[] array = new Object[]{1, "2", 3, "4"};
        for (Object object : array) {
            if (object instanceof String) {
                System.out.println(object);
            }
        }
    }
}
