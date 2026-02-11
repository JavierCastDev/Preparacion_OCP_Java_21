package certification;

public class VariablesAndConstants {

    public static void main(String[] args) {

        // Variables
        // A variable is like a box that stores data.

        // A String stores text; the value must be enclosed in double quotes ("").
        String text = "This is a string";
        System.out.println(text.getClass());
        System.out.println(text);

        // We can reassign the value of a variable, but it must remain the same type.
        text = "This is another string";
        System.out.println(text);

        // This would fail because Java is a strongly typed language.
        // text = 10;

        // An int stores an integer (whole number).
        int number = 10;
        System.out.println(number);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Constants

        // Constants cannot change their stored value once initialized.
        final String EMAIL = "email@email.com"; // By convention, constants are written in uppercase.
        // EMAIL = "email2@email.com"; // This will throw a compilation error.

        // Java can also infer the type automatically using 'var' (introduced in Java 10).
        var test = "test";
    }
}