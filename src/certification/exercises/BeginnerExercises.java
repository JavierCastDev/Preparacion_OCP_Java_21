package certification.exercises;

public class BeginnerExercises {

    public static void main(String[] args) {

        //  1.Declare a String variable and assign your name to it.

        String myName = "Javier";

//  2.Create an int variable and assign your age to it.

        int myAge = 28;

//  3.Create a double variable with your height in meters.

        double myHeight = 1.70;

//  4.Declare a boolean variable that indicates whether you like programming.

        boolean iLikePrograming = true;

//  5.Declare a constant with your email.

        final String MY_EMAIL = "myemail@gmail.com";

//  6.Create a char variable and store your initial in it.

        char initial = 'J';

//  7.Declare a String variable with your location, then change its value and print it again.

        String myLocation = "The moon";

        System.out.println(myLocation);

        myLocation = "Joke, Mexico";

        System.out.println(myLocation);

//  8.Create an int variable named a and another named b, then print the sum of both.

        int a = 1;
        int b = 2;

        var c = a + b;

        System.out.println(c);

//  9.Print the type of two variables created previously.

        System.out.println(myName.getClass().getSimpleName());
        System.out.println(myLocation.getClass().getSimpleName());

//  10.Try declaring a variable without initializing it, and then assign it a value before printing it.

        int number;

        number = 10;

        System.out.println(number);

    }
}

