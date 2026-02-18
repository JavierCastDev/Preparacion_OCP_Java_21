package certification.exercises;

public class StringExercises {

    public static void main(String[] args) {

        // 1. Concatenate two text strings.

        String hello = "Hello";
        String world = "World";

        System.out.println(hello + world);

        // 2. Display the length of a text string.

        String length = "Word";

        System.out.println(length.length());

        // 3. Display the first and last characters of a string.

        String character = "aeiou";

        System.out.println(character.charAt(0));
        System.out.println(character.charAt(character.length() - 1));

        // 4. Convert a string to uppercase and lowercase.

        String upperAndLower = "uPPer";

        System.out.println(upperAndLower.toUpperCase());
        System.out.println(upperAndLower.toLowerCase());

        // 5. Check if a text string contains a specific word.

        String phrase = "Check this text";

        System.out.println(phrase.contains("text"));

        // 6. Format a string with an integer.

        var integer = 10;

        System.out.println(String.format("This is the number %d", integer));

        // 7. Remove leading and trailing whitespace from a string.

        String spaces = "  This is a text     ";

        System.out.println(spaces.trim());

        // [Advanced] .strip() (Java 11+): Unlike .trim(), it is "Unicode-aware".
        // It removes spaces defined by the Unicode standard, not just ASCII characters <= U+0020.
        System.out.println(spaces.strip());

        // 8. Replace all whitespace in a string with a hyphen (-).

        String moreSpaces = "      Text     ";

        System.out.println(moreSpaces.replace(" ", "-"));

        // [Advanced] .replaceAll("\\s+", "-"): Uses Regex (Regular Expressions).
        // "\\s" captures any whitespace (tabs, newlines).
        // The "+" is a quantifier that collapses multiple spaces into a single hyphen.
        System.out.println(moreSpaces.replaceAll("\\s+", "-"));

        // 9. Check if two strings are equal.

        var textOne = new String("This is a text");
        var textTwo = new String("This is another text");

        // [Advanced] .equals(): Compares the actual content of the objects.
        // Using 'new String()' forces Java to create separate objects in memory.
        // Using '==' would return false because it compares memory references, not the text.
        System.out.println(textOne.equals(textTwo));

        // 10. Check if two strings have the same length.

        String shortWord = "This is a short text";
        String longWord = "This is a long text";

        System.out.println(shortWord.length() == longWord.length());

    }
}
