package certification;

public class Operators {

    public static void main(String[] args) {

        // Java operators allow us to perform operations on variables or literals.

        // Arithmetic Operators
        var a = 5; // Inferred as int
        var b = 2; // Inferred as int

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        /* * IMPORTANT FOR OCP:
         * Since both 'a' and 'b' are integers, Java performs "Integer Division".
         * The fractional part is discarded (truncated), not rounded.
         * To get a decimal result, one operand must be a float or double.
         */

        // Comparison Operators

        System.out.println(a == b); // a is not equal to b; this returns false
        System.out.println(a == a); // a is equal to itself; this returns true
        System.out.println(a != b); // a is different from b; this returns true
        System.out.println(a > a); // a is not greater than itself; this returns false
        System.out.println(a < b); // a is not less than b; this returns false
        System.out.println(a <= b); // a is neither less than nor equal to b; this returns false
        System.out.println(a >= b); // a is greater than b; this returns true
        System.out.println(b <= a); // b is less than a; this returns true

        // Assignment Operators

        a = 6;
        a += 1; // The result is 7
        System.out.println(a);
        a -= 1; // The result is 6, because the previous value was 7
        System.out.println(a);
        a *= 2; // The result is 12
        System.out.println(a);

        // Logical Operators

        // Using Truth Tables

        // Logical AND (&&)
        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False
        System.out.println(5 > 2 && 5 == 5); // True
        System.out.println(5 < 2 && 5 == 5); // False

        // Logical OR (||)
        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true); // True
        System.out.println(false || false); // False
        System.out.println(5 > 2 || 5 == 5); // True
        System.out.println(5 < 2 || 5 == 5); // True

        // Logical NOT (!)

        System.out.println(!true); // False
        System.out.println(!false); // True
        System.out.println(!(5 > 2) || 5 > 5); // False

        // Unary Operators

        System.out.println(+a); // Indicates a positive value
        System.out.println(-a); // Negates the value
        System.out.println(++a); // Pre-increment: results in 13
        System.out.println(--a); // Pre-decrement: results in 12

        // If we use the operator before the variable, the value is updated before the expression is evaluated.
        // If we use the operator after the variable, the value is updated after the expression is evaluated.
    }
}