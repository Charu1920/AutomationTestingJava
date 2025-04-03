package practice;

public class StringReverse {

	public static void main(String[] args) {
     String orginalStr = "charugupta";
     String reverseStr = " ";
     for(int i=0;i<orginalStr.length();i++) {
    	 reverseStr = orginalStr.charAt(i) + reverseStr;
     }
     System.out.println("reverse of the String :" + reverseStr );
   
	}

}
