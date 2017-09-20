package oop.classjava;

/**
 * Can access other members of the enclosing class, even if they are declared private.
 * because an inner class is associated with an instance, it cannot define any static members itself.
 * An instance of Inner Class can exist only within an instance of Outer Class.
 * use inner classes to implement helper classes.
 * can be private
 */
public class InnerClass {

    private int width;
    private int height;

    {
        width = 5;
        height = 7;
    }

    public static void main(String[] args) {

        InnerClass outerObj = new InnerClass();

        InnerClass.IAmInner innerObj = outerObj.new IAmInner();

        int area = innerObj.getArea();

        System.out.println(area);
    }

    public class IAmInner {

        public int getArea() {
            return width * height;
        }
    }
}
