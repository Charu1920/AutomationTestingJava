package practice;

/*
1
12
123
1234
*/
//different pattern number 
//In different pattern numbers me inner loop ke variable ko print(j) print krwate h
//in same pattern number me outer loop ke variable ko print(i) kawate hai
public class NestedforLoop {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) { //outer loop : rows  i=1
			for(int j=1;j<=i;j++) { //inner loop : columns j=1 , j=2
				System.out.print(j);//1    
			}//j++
			System.out.println();
		}//i++


	}

}
