package practice;

public class DaysOfweeks {

	public static void main(String[] args) {
		int dayNumber = 7;
		
		if(dayNumber == 1) {
			System.out.println("week of Monday");
		} else if(dayNumber == 2) {
			System.out.println("week of Tuesday ");
		}else if(dayNumber == 3) {
			System.out.println("week of Wednesday ");
		}else if(dayNumber == 4) {
			System.out.println("week of Thrusday ");
		}else if(dayNumber == 5) {
			System.out.println("week of Friday ");
		}else if(dayNumber == 6) {
			System.out.println("week of Saturday ");
		}else if(dayNumber == 7) {
			System.out.println("week of Sunday ");
		}else {
			System.out.println("Invalid Number, please write the dayNumber in between(1-7)");
		}

	}

}
/*1. Write a program to print the day of the week based on an input number (1-7). For example:

Input 1 → Output: "Monday"

Input 7 → Output: "Sunday"
Use an if-else ladder to implement this.*/