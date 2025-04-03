package practice;

public class TestPractice {
	static int arr[]= {25,11,12,7,8,56,36,75,86,36,7,11,89,23,56,1,1,1,25,12,90,34,89,67,35,90,77,22,47,85,23,47,77,85,500};
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++){ //outer loop i=1
			 for(int j=i+1;j<arr.length;j++) { //inner loop j=1
				 if(arr[i]==arr[j]) {
					 System.out.println("sameElement of the array is "+ arr[i]);
				 }
				 
			 }//j++
			
		}//i++
			

	}

}
