package practice;
//How do you swap two numbers without using the third variable.
public class VeriableWithoutUsingThird {

	public static void main(String[] args) {
       int a= 12;
       int b = 13;
       a = a+b;
       b = a-b;
       a = a-b;
      
       System.out.println("a value is " + a);
       System.out.println("b value is " + b);


	}

}
