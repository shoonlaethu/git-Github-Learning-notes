package conditionExercise;

import java.util.Scanner;

public class exone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		1. Write a Java program to get a number from the user and print whether it is positive 
        //		or negative.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double no = scanner.nextDouble();
        if (no > 0) {
            System.out.println("Your number is positive.");
        } else if (no < 0) {
            System.out.println("Your number is negative.");
        } else {
            System.out.println("Your number is zero.");
        }

	}

}
