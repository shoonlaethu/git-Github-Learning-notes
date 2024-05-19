package conditionExercise;

import java.util.Scanner;

public class exFour {
	public static void main(String[] args) {
		// TODO Auto-generated method stubne
//		4. Write a Java program to check whether an alphabet letter is a vowel or a consonant.5. Write a Java program that takes three numbers from the user and prints the smallest number.        //		3. Write a Java program to check whether a given year is leap.     Scanner scanner = new Scanner(System.in);

		    Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter letter: ");
	        String letter=scanner.next();

	        if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") {
	            System.out.println("vowel.");
	        } else {
	            System.out.println("consonant .");
	        }
        

   }
		
		


	
}
