package oop.object;

import oop.classjava.Bicycle;

/**
 * Garbage Collection:
 * JRE deletes objects when it determines that they are no longer being used.
 * An object is eligible for garbage collection when there are no more references to that object.
 * References that are held in a variable are usually dropped when the variable goes out of scope.
 * you can explicitly drop an object reference by setting the variable to the special value null.
 * A program can have multiple references to the same object;
 *      all references to an object must be dropped before the object is eligible for garbage collection.
 * Garbage collector periodically frees the memory used by objects that are no longer referenced.
 *
 * an object can have multiple references to it.
 */
public class Object {

    public static void main(String[] args) {

//        Simply declaring a reference variable does not create an object.
        Bicycle bicycle;

//        new keyword create object.
// *      new followed by constructor initializes the object.
//        new operator returns a reference to the object it created.
        bicycle = new Bicycle(0, 0);

//        This object is unreferenced, and its resources are free to be recycled by the Java Virtual Machine.
        int speed = new Bicycle(5, 5).getId();
    }
}
