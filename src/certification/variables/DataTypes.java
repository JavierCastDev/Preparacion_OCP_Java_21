package certification.variables;

public class DataTypes {

    public static void main(String[] args) {

        // Primitive data types

        // Stores an integer (whole number)
        int myNumber = 1;
        System.out.println(myNumber);

        // Stores a decimal number (floating-point)
        double myDouble = 1.10;
        System.out.println(myDouble);
        // We also have long, float, and byte.

        // Stores a single character inside single quotes
        char myChar = 'a';
        System.out.println(myChar);

        // Stores true or false values
        boolean myBoolean = true;
        System.out.println(myBoolean);

        // String is a class, not a primitive type, but it is a basic and commonly used type.
        String string = "abc";
        System.out.println(string);

        // Speaking of classes, we can use a method to check the variable's type.
        System.out.println(string.getClass());
        // Or we can get just the simple name of the class.
        System.out.println(string.getClass().getSimpleName());
    }
}