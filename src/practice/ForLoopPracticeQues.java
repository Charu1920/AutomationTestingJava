/*
Write a program to print the following pattern in java using for loop
****

***

**

*

*/
package practice;

public class ForLoopPracticeQues {

	public static void main(String[] args) {
		
		for(int i=7; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
          
		
	}

}
