//Write a program to find the number of spaces in the following sentence 
//"This is our class"
package practice;

public class NumberOfSpace {
 static	String mystr = "This is our class";
   static int spaceCount = 0;
	public static void main(String[] args) {
	
		for(int i = 0; i<mystr.length(); i++) {
			if(mystr.charAt(i) == ' '){
				spaceCount=spaceCount+1;
			}
		}
		System.out.println("Number of SpaceCount " + spaceCount);

	}

}
