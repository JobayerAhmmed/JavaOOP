package basic;

/**
 * Created by bsse0 on 8/1/2017.
 */
public class Boxing {

    public static void main(String[] args) {
        // boxing
        Integer a = new Integer(5); // Integer - wrapper class
        // autoboxing
        Integer b = 10;

        // unboxing
        System.out.println(a + " " + b);

        // unboxing
        int x = a;
        int y = b;

        System.out.println(x + " " + y);
    }
}
