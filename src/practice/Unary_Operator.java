package practice;

public class Unary_Operator {

	public static void main(String[] args) {

     int b = 6;
     System.out.println(b++ + --b - b++ + b-- - ++b);
     //6(7) +6(6) - 6(7) + 7(6) -7
     //6(7) + 6(6) -6(7) + 7(6) -7(7)

	}

}
