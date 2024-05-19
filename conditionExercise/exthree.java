package conditionExercise;

import java.util.Scanner;

public class exthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		3. Write a Java program to check whether a given year is leap.     Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        
		int year = scanner.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || (year % 400 == 0)) {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + "leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
		
		


	}

}
