package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();
			char ch;
			String nstr = "";
			for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			nstr = ch + nstr;
			}
			System.out.println("Reversed String is : " + nstr);
			System.out.println("Reversed String is program");
			System.out.println("Reversed String is program very easy and very simple");

	}

}
