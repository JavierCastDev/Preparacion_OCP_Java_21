package certification.basics;

public class Strings {

    public static void main(String[] args) {

        //A string is a char sequence.
        //A string is a class.

        String name = "name";

        //Since String is a class, we can create an instance of it.
        var nameTwo = new String("Name");

        //Concatenation

        String myName = "Jav";
        String myLastName = "vier";
        var concatenation = 1;

        var concat = myName + myLastName;

        System.out.println(concat);
        System.out.println(myName + concatenation);

        //Length
        //This function shows the length of the string.
        //Note that spaces are also characters and are included in the count.
        System.out.println(myName.length());

        //charAt
        //Prints the char of the index requested, remember that all indices start at zero.
        System.out.println(myLastName.charAt(0));

        //We must be careful when we want to obtain an index that doesn't exist, this throws an exception
        //System.out.println(myLastName.charAt(5));

        //The safest way is using the function length -1.
        System.out.println(myLastName.charAt(myLastName.length() - 1));

        //Substring
        //A substring is a new String containing a portion of the original character sequence.
        //OCP REMINDER; substring() creates a new object, doesn't modify the original.
        System.out.println(myName.substring(1));
        System.out.println(myName.substring(1, 3));

        //Here I experimented with the functions.
        String longString = "Parangaricutirimicuaro";
        System.out.println(longString.substring(2, longString.length() - 2));

        //Uppercase and Lowercase

        String test = "Word";
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        //What contains?

        String content = "This is content";
        //If the variable contains the char sequence in the function, throws true, else, false.
        System.out.println(content.contains("This"));

        //Here I tried something tricky, as we remember, a space still is a character.

        String tricky = "   ";

        //isEmpty verifies if a string doesn't contain something.
        System.out.println(tricky.isEmpty());
        //isBlank checks if a string is empty or consists only of whitespace characters.
        System.out.println(tricky.isBlank());

        //Equals

        String textOne = "One";
        String textTwo = "Two";
        String textThree = "One";
        String textFour = "One ";
        String textFive = "one";

        System.out.println(textOne.equals(textTwo));
        System.out.println(textOne.equals(textThree));
        //Since textFour contains a space, it is not equal to textOne.
        System.out.println(textOne.equals(textFour));
        //Equals is sensitive to Upper and Lowercase.
        System.out.println(textOne.equals(textFive));
        //If case sensitivity is not required, we use this function.
        System.out.println(textOne.equalsIgnoreCase(textFive));

        //Trim

        String trimedText = " Trim this. ";
        //This removes leading and trailing whitespace.
        System.out.println(trimedText.trim());

        //Replace
        String replacedText = "Hi my name is Java";
        //This function replaces a specific char sequence
        System.out.println(replacedText.replace("Java", "Javier"));

        //Curiosity to OCP

        var a = "a";
        var sencondA = "a";
        var curiosity = new String("a");

        System.out.println(a.equals(sencondA));//This returns true because the contents are identical.
        System.out.println(a.equals(curiosity));//This returns true because the contents are identical.

        System.out.println(a == sencondA);//This returns true because the contents are identical.
        System.out.println(a == curiosity);//What? This returns false

        /*In this case, we are comparing object references. String literals are stored in the String Pool,
        so 'a' and 'secondA' point to the same object. However, 'new String()' creates a new object in
        the Heap, resulting in a different reference, which is why '==' returns false.
         */


        //Format

        var greeting = "Hello";
        var percent = 100;

        //By convention, we use %s for Strings, %d for integers (decimal integer), and %f for floating-point numbers.
        System.out.println(String.format("%s, my favorite programming language is Java, %d %%.", greeting, percent));

    }
}
