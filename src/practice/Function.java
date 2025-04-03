package practice;

import java.util.Scanner;

public class Function {
	
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}
	public static void printMyAge(int age) {
		System.out.println(age);
		return;
	}
	public static int printSumOfNumber(int a, int b) {
		return a+b;
	}
	//Write a function to multiply 2 numbers.
	public static int printMultiplyNumber(int c, int d) {
		return c*d;
	}

	//Make a function to check if a given number n is even or not.

	public static boolean printEvenNumber(int n) {
		return n%2==0;
	}
	
	public static void main(String[] args) {
		String name = "Charu Gupta";
		int age= 25;
		printMyAge(age);
		printMyName(name);
		int number = printSumOfNumber(12,12);
		System.out.println(number);
		
		int multiply =printMultiplyNumber(2,4);
		System.out.println(multiply);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int n = scanner.nextInt();
		//int n = 4;
		System.out.println("This the Even number " + n  +  printEvenNumber(n));
		

	}

}
