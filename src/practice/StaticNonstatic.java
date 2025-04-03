package practice;

public class StaticNonstatic {

	public static void main(String[] args) {
     add(3,8);
     add(36,82); // static method calling
     
     StaticNonstatic obj1 = new StaticNonstatic(); // object already defined for multiplying static or non- static methods
     obj1.add2(4.5f, 2.6f);   // non-static method calling
     
     //int c = multiply(3,9);
     int productOfDigit = multiply(4,8); //static method calling 
     System.out.println("multiplying of 2 digits numbers " + productOfDigit);
     
     int productOfDigit1 = obj1.multiply(9,8); //non- static method calling 
     System.out.println("multiplying of 2 digits numbers " + productOfDigit1);

	}
    public static void add(int a, int b){ //static methods
    	int c = a+b;
    	System.out.println("addition of 2 digits " + c);
    	
    }
    public void add2(float a , float b) {  //non-static method
    	float c = a+b;
    	System.out.println("addition of 2 float digit number "+ c);
    }
    
    public static int multiply(int a , int b) {
    	int c = a*b;
    	return c;
    }
    public int multiply1(int a , int b) {
    	int c = a*b;
    	return c;
    }
}
