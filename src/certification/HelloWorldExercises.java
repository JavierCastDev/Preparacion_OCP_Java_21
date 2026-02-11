package certification;

import java.util.Scanner;

public class HelloWorldExercises {

    public static void main(String[] args) {

        //1. Write code that prints your name

        //Using this code we can print a sentence
        System.out.println("Your name (just a joke)");

        //2. Print "Hello" and "World" on two separate lines using a single print statement

        //Using \n allows me to split the sentence into two lines; \n represents a line break.
        System.out.println("Hello\nWorld");

        //3. Add a comment above every line of code explaining its function

        // <- To do a comment

        //4. Create a multi-line comment

        /*Using the /* we can create a multi-line comment
        that automatically creates a new line comment when pressing enter
         */

        //5. Print your age, your favorite color, and your city

        System.out.println("Im 28 years old");
        System.out.println("My favorite color is green");
        System.out.println("I live in Mexico City");

        //6. Explore the different System.XXX.println(); methods

        /*Requesting the JVM to run the Garbage Collector.
        It is important to note that this is only a hint/suggestion
         */
        System.gc();

        //This is used to print a message error or technical alert
        System.err.println("Your favorite color is red");

        //This is used to read a user input, it must be stored in a variable
        //System.in.read();
        //int valor = System.in.read();
        //Currently, the Scanner class is the preferred way to handle user input

        //This line initializes the Scanner
        Scanner sc = new Scanner(System.in);

        //To make it more didactic we can do a question that the user can answer
        System.out.println("What is your favorite color?");
        //After showing the question, the next line will be available to the user to write their answer, which will be stored in the color variable
        String color = sc.nextLine();
        //Next we can print a sentence using the value stored in the variable
        System.out.println("Your favorite color is " + color);

        //7. Use more than one println to print a single phrase

        //To make it more didactic I have used two scanner and then I printed them

        Scanner sc2 = new Scanner(System.in);
        System.out.println("What is your favorite color?");
        String color2 = sc2.nextLine();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("What is your favorite food?");
        String food = sc3.nextLine();

        System.out.println("Your favorite food is " + food);
        System.out.println("And your favorite color is " + color2);

        //8. Print an ASCII art design (for example, a smiley face using symbols)

        System.out.println("(>.<)");
        System.out.println(" ( )");
        System.out.println(" /\\"); //If I use a single \ the IDE shows an error, I must put two \


        //9. Try to execute the program without the main method and explain the resulting error

        /*The IDE disabled the "Run" button. Without a main method,
        the JVM doesn't know where the entry point is
         */

        //10. Change the file name so it is different from the class name, then compile it and describe what happens

        /*The IDE indicates that the file name and the class name MUST match. This is
        a Java requirement for proper class loading and organization
         */
    }
}
