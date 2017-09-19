package basic;

/**
 * Created by bsse0 on 7/31/2017.
 */
public class DataType {

    public static void main(String[] args) {

//        primitive types
//        not objects, nor references to objects
        byte aByte;  // 8 bit; -128 ~ 127; default: 0
        short aShort;    // 16 bit; -32768 ~ 32767; 0
        int aInt;  // 32 bit; 0
        long aLong; // 64 bit; 0L
        float aFloat; // 32 bit; 0.0f
        double aDouble; // 64 bit; 0.0d
        boolean pass;    // 1 bit; false
        char aCharacter; // 16 bit Unicode character; '\u0000' (0) ~ '\uffff' (65535); '\u0000'

        // In Java SE 7 and later, any number of underscore characters (_)
        // can appear anywhere between digits in a numerical literal
        // Invalid underscore placement:
                // x = 3_.1415F;
                // x = 3._1415F;
                // x = 999_99_9999_L;
                // x = 52_;
                // x = _52;
        // Valid underscore placement:
                // x = 5____2;
        aByte = 120;
        aShort = 32_000;
        aInt = 200_00_00_000;
        aLong = 20_000_00_00_000L;
        aFloat = 100.05f;
        aDouble = 5.55;
        pass = true;
        aCharacter = 'A';

        System.out.println("Assigned values: ");
        System.out.println("Byte: " + aByte);
        System.out.println("Short: " + aShort);
        System.out.println("Int: " + aInt);
        System.out.println("Long: " + aLong);
        System.out.println("Float: " + aFloat);
        System.out.println("Double: " + aDouble);
        System.out.println("Boolean: " + pass);
        System.out.println("Character: " + aCharacter);
    }
}
