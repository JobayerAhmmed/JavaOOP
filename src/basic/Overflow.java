package basic;

/**
 *
 * If it overflows, it goes back to the minimum value and continues from there.
 * If it underflows, it goes back to the maximum value and continues from there
 * For non-integer based data types, the overflow and underflow result in Infinity and -Infinity values.
 */
public class Overflow {

    public static void main(String[] args) {
        //If we are creating a byte type variable and assigning it a value,
        // the value will be treated as an int and hence a potential overflow condition.

        // Overflow
        int a = Integer.MAX_VALUE;
        System.out.println("Overflow int: " + (a + 1));

        // Underflow
        int b = Integer.MIN_VALUE;
        System.out.println("Underflow int: " + (b - 1));

        // Overflow; non-integer
        float x = 3.4028235E38f * 20f;
        System.out.println("Overflow float: " + x);

        // Underflow; non-integer
        float y = -3.4028235E38f * 20f;
        System.out.println("Underflow float: " + y);
    }
}
