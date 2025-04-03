package practice;

/*
 4
 43
 432
 4321
 */
public class FooLoopPracticeQuestion {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) { //outer loop : rows  i=1
			for(int j=4;j>=5-i;j--) { //inner loop : columns j=1 , j=2
				System.out.print(j);
			}//j++
			System.out.println();
		}//i++

	}

}
