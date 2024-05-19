package conditionExercise;

import java.util.Scanner;

public class exEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		8. Create a new program. User should input a number between 0 and 100. 
        //		When the program is ran, it should output an alphabetic grade according to the 
        //		following logic: 
        //		A number higher than 70 counts as an A 
        //		A number higher than 60 and less than or equal to 70 counts as a B A number higher than 50 and less than or equal to 60 counts as a C A number higher than 40 and less than or equal to 50 counts as a D A number higher than 30 and less than or equal to 40 counts as a E Anything less than or equal to 30 counts as an F 
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 0 and 100: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Invalid input. Please enter a number between 0 and 100.");
        } 
        else 
        { 
        	char grade;
           
            if (score > 70) {
            grade = 'A';
            } else if (score > 60) {
            grade = 'B';
            } else if (score > 50) {
            grade = 'C';
            } else if (score > 40) {
            grade = 'D';
            } else if (score > 30) {
            grade = 'E';
            } else {
            grade = 'F';
            }    
            System.out.println("Grade: " + grade);
      }
            System.out.println("number should between 0 and 100 Write Again ");
       }


  }


