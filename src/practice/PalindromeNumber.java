package practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 12341;
		int num1 = num;
		int reverseNum = 0;
		
		while(num1!=0){
			int d = num1%10; //extract last digit
			reverseNum =reverseNum*10+d;
			num1 = num1/10;
		}
		if(reverseNum==num) {
			System.out.println("Number is a palindrome");
		}else {
			System.out.println("Number is not a palindrome");
		}
	}

}
