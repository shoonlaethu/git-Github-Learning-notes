package conditionExercise;

import java.util.Scanner;

public class extwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		2. Write a Java program that takes a number from the user and generates an integer 
        //		between 1 and 7. It displays the weekday name.(use switch statement)
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number between 1 and 7: ");
	        int no = scanner.nextInt();
	        String weekdayName;
	        switch (no) {
	            case 1:
	                weekdayName = "Sunday";
	                break;
	            case 2:
	                weekdayName = "Monday";
	                break;
	            case 3:
	                weekdayName = "Tuesday";
	                break;
	            case 4:
	                weekdayName = "Wednesday";
	                break;
	            case 5:
	                weekdayName = "Thursday";
	                break;
	            case 6:
	                weekdayName = "Friday";
	                break;
	            case 7:
	                weekdayName = "Saturday";
	                break;
	            default:
	                weekdayName = "Invalid input.";
	        }

	        System.out.println("WeekdayName is: " + weekdayName);

	}



}
