package conditionExercise;

import java.util.Scanner;

public class exSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		//		6. Write a java code that accepted required input from the user, calculate user’s BMI 
	     Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your weight in kilograms: ");
	        double weight = scanner.nextDouble();
	        System.out.print("Enter your height in centimeter: ");
	        double height = scanner.nextDouble();

	        double bmi = weight / (height * height);
	        System.out.println("Your BMI is: " + bmi);

	        if (bmi < 18.5) {
	            System.out.println("underweight.");
	        } else if (bmi >= 18.5 && bmi < 25) {
	            System.out.println("normal.");
	        } else if (bmi >= 25 && bmi < 30) {
	            System.out.println("overweight.");
	        } else {
	            System.out.println("obese.");
	        }
		

	}

}
