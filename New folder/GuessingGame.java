// import required classes for the program
import java.util.Scanner;
import java.lang.Math;

public class GuessingGame{
    public static void main(String[] args) {
               // generate a random number between 1 and 100

        int answer = (int) (Math.random() * 100) + 1;
       // number of trials that the user has to guess the number

        int k=5;
       // create a scanner object to read user input

        Scanner input = new Scanner(System.in);
        System. out.println("I'm thinking of a number between 1 and 100.\nYou have 5 tries to guess the number.");
        // Read user input and check if it is correct
        while (k>0) {
            System. out.println("Enter your guess: ");
            int guess =input.nextInt();
            if (guess == answer) {
                System.out.println("You win!");
                break;
            } else if (guess > answer) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
            k--;
        }
        if (k==0) {
            System.out.println("You lose!");
        }
    }
}
