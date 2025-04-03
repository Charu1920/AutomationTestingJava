package practice;

public class NestedForLoop_Samepattern {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++) { //outer loop : rows  i=1
			for(int j=1;j<=i;j++) { //inner loop : columns j=1 , j=2
				System.out.print(i);//1  
				                    //22
				                   // 333
				                   // 4444
			}//j++
			System.out.println();
		}//i++

	}

}
