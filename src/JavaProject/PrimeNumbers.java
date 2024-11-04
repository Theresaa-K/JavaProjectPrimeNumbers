package JavaProject;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        /* Done by Theresa, Write a Java program to check
        whether a given number is prime or not.*/

        Scanner userInput= new Scanner(System.in);
        System.out.println("Please enter a whole number");
        //user will enter a number to check if number is prime or not.

        int inputValue = userInput.nextInt(); // allows user to respond using numbers

        //use for loop statement to check prime number
        //using if statement to print not a prime number with numbers less than 2
        if (inputValue<2){
            System.out.println("Not a prime number");
            return; //Ends program early if number is less than 2
        }
        boolean isPrime = true; //Checking for number divisibility
        for (int i = 2; i <= Math.sqrt(inputValue);i++) {
            if (inputValue % i == 0) {
                isPrime = false;
                break; //Exits loop
            }
        }
        if (isPrime){
            System.out.println(inputValue + " is a prime number.");
        }else {
            System.out.println(inputValue + " is not a prime number");
        }

        userInput.close();
    }
}
