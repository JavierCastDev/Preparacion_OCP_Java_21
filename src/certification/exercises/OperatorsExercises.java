package certification.exercises;

public class OperatorsExercises {

    public static void main(String[] args) {

        int generalNumber = 10;

        // 1. Create a variable with the result of each arithmetic operation.

        var number1 = 1+2;
        System.out.println(number1);
        var number2 = 2-3;
        System.out.println(number2);
        var number4 = 3*4;
        System.out.println(number4);
        var number5 = 4/5;
        System.out.println(number5);
        var number6 = 5%6;
        System.out.println(number6);

        // 2. Create a variable for each type of assignment operation.

        var asignNumber = generalNumber;
        System.out.println(asignNumber);

        asignNumber += 1;
        System.out.println(asignNumber);

        asignNumber -= 1;
        System.out.println(asignNumber);

        asignNumber *= 2;
        System.out.println(asignNumber);

        asignNumber /= 2;
        System.out.println(asignNumber);

        asignNumber %= 2;
        System.out.println(asignNumber);

        // 3. Print 3 true comparisons using different comparison operators.

        System.out.println(5 > 1);
        System.out.println(generalNumber < 100);
        System.out.println("a" == "a");

        // 4. Print 3 false comparisons using different comparison operators.

        System.out.println(7 <= 5);
        System.out.println('a' > 'b');
        System.out.println('a' != 'a');

        // 5. Use the logical AND operator.

        System.out.println(7 > 5 && 6 > 1);

        // 6. Use the logical OR operator.

        System.out.println(7 > 5 || 1 > 3);

        // 7. Combine both logical operators.

        System.out.println(7 > 5 && 6 > 1 || 9 > 3 && 3 < 2);

        // 8. Add a negation.

        System.out.println(!true);

        // 9. Print 3 examples of using unary operators.

        System.out.println(+generalNumber);
        System.out.println(-generalNumber);
        System.out.println(--generalNumber);

        // 10. Combine arithmetic, comparison, and logical operators.

        System.out.println(5 + 1 == 6 || 'a' > 3);

    }
}
