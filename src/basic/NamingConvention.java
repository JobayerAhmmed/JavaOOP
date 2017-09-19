package basic;

/**
 * Package: lowercase: com.munshi.tutorguide.post
 * Class: noun, PascalCase/UpperCamelCase: DocumentReader
 * Interface: follow class
 * Method: verb, followed by adjectives, nouns. lowerCamelCase: findSum()
 * Variable: local variable, instance variable, class variable in lowerCamelCase.
 *          int width;
 *          static int numberOfObjectCreated;
 * Constant: uppercase, separated by underscore: static final int MAX_SPEED = 80;
 */
public class NamingConvention {

    public static final int MAX_NUMBER_OF_OBJECT = 5;
    public static int numberOfObjectCreated = 0;

    private int width;
    private int height;

    public NamingConvention(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(int width, int height) {
        int result;
        result = width * height;
        return result;
    }
}
