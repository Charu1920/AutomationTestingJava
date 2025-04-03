package practice;

public class InterfaceClass  implements Interface1{
  
	public void interfaceMethod() {
	System.out.println("this is a abstract method");	
	}
	public static void main(String[] args) {
		InterfaceClass obj1 = new InterfaceClass();
		obj1.interfaceMethod();
	}
	
}
