package certification.basics;

public class References {

    public static void main(String[] args) {

        /*You can have as many references to an object  as you want.
        When you assign one reference to another, you basically just copy
        the value contained in one reference into another.
         */

        // Create a new String object in the Heap memory
        var stringOne = new String("Hello");

        // Get the unique identity hash code (memory-like reference) for the first object
        var reference = System.identityHashCode(stringOne);

        // Print the hash code to the console
        System.out.println(reference);

        // Assign the reference of the first object to a new variable (Shallow Copy)
        var stringTwo = stringOne;

        // Get the identity hash code of the second variable
        var referenceTwo = System.identityHashCode(stringTwo);

        // Print the second hash code (it will be identical to the first one)
        System.out.println(referenceTwo);

        /* * NOTE: This is NOT a direct memory address. In Java, actual memory addresses
         * are managed and moved by the Garbage Collector (GC) for optimization.
         * System.identityHashCode() provides the closest unique identifier to an object's
         * identity, behaving like a "passport ID" that remains constant even if the
         * GC moves the object to a different physical location in the Heap.
         */
    }
}
