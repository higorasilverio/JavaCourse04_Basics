package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Program that calculates the income of a employee, given its data ***");
		System.out.print("Enter the employee number: ");
		int employee = scanner.nextInt();
		System.out.print("Enter the total of worked hours: ");
		double workedHours = scanner.nextDouble();
		System.out.print("Enter the hour value: ");
		double hourValue = scanner.nextDouble();
		double income = workedHours * hourValue;
		System.out.println("Number = " + employee);
		System.out.printf("Salary = U$ %.2f", income);
		
		scanner.close();
	}

}
