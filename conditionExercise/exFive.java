package conditionExercise;

import java.util.Scanner;

public class exFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		5. Write a Java program that takes three numbers from the user and prints the smallest number.
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();
	        System.out.print("Enter third number: ");
	        double num3 = scanner.nextDouble();

	        double smallest;

	        if (num1 <= num2 && num1 <= num3) {
	            smallest = num1;
	        } else if (num2 <= num1 && num2 <= num3) {
	            smallest = num2;
	        } else {
	            smallest = num3;
	        }

	        System.out.println("Smallest number: " + smallest);
	    }

	}


