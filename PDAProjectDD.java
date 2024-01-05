import java.util.Scanner;
import java.util.*;
import java.lang.Math;  //helps to do math operations like rounding up


public class PDAProjectDD
{
    /**
     * Constructor for object of class PDA
     */
    public PDAProjectDD()
    {
        //We dont need to do anything in the contructor for our
        //program
    }
    
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        boolean shouldContinue = true;
        Scanner scanner = new Scanner(System.in);
        double age;  // this was an integer before; changed it to double for rounding
        int LOWER_BOUND = 14;
        System.out.println("Welcome to PDA!");
        while (shouldContinue) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextDouble(); //instead of asking for nextInt() asked for nextDouble() to accept decimals
                age = Math.round(age);
                System.out.println("this is rounded up " + age); // tells you the rounded number
                int lowest_age = (int)age/2+7; // declared operations to use (int) to force doubles to integers
                int highest_age = ((int)age-7)*2; // same as above
                int Lrounded = lowest_age + 1;
                  
                
                if (age == 0) {
                    shouldContinue = false;
                    System.out.println ("Bye");
            } else if (age < LOWER_BOUND) {
                System.out.println(age+" is too young!");
            } else if (age % 2 != 0) {
                System.out.println ("The highest age you can date is " + highest_age);
                System.out.println ("The lowest age you can date is " + Lrounded);
                System.out.println ("Enter 0 to exit");
            } else {
                System.out.println ("The highest age you can date is " + highest_age);
                System.out.println ("The lowest age you can date is " + lowest_age);
                System.out.println ("Enter 0 to exit");
            }
            } catch (InputMismatchException error) {
            scanner.next();
            System.out.println("Please enter an integer");
            }


       }
    }   
}  