package oop.classjava;

/**
 * Cannot access other members of the enclosing class, can use them only through an object reference.
 */
public class StaticNestedClass {

    private int width;
    private int height;

    public static void main(String[] args) {

        StaticNestedClass.InnerStaticClass innerObj = new StaticNestedClass.InnerStaticClass();

        int area = innerObj.getArea();
    }

    public static class InnerStaticClass {

        public int getArea() {
            StaticNestedClass obj = new StaticNestedClass();
            return obj.width * obj.height;
        }
    }
}
