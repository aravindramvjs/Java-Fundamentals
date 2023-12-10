package day07.practice;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // creating scanner object
		
		System.out.print("Enter Number of this day: ");
		int day = scan.nextInt();

		switch (day) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}
		
		scan.close();

	}

}
