package conditionExercise;

import java.util.Scanner;

public class exSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //		7. Write a Java program to read temperature in centigrade and display a suitable 
        //		message according to the temperature state below:
        //		Temp < 0 then Freezing weatherTemp 0-10 then Very Cold weatherTemp 10-20 then Cold weatherTemp 20-30 then Normal in TempTemp 30-40 then Its Hot
        //		Temp >=40 then Its Very Hot
		
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in centigrade: ");
        double temp = scanner.nextDouble();
        if (temp < 0) {
            System.out.println("Freezing weather");
        } else if (temp >= 0 && temp < 10) {
            System.out.println("Very Cold weather");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("Cold weather");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("Normal in Temp");
        } else if (temp >= 30 && temp < 40) {
            System.out.println("It's Hot");
        } else {
            System.out.println("It's Very Hot");
        }

	}

}
