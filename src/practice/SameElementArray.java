package practice;

public class SameElementArray {

	static int arr[]= {25,11,11,7,7,56,56,75,86,30};
	public static void main(String[] args) {
		
		   //outer loop 
		for(int i=0;i<arr.length;i++){ //outer loop i=0,1
			 for(int j=i+1;j<arr.length;j++){ //inner loop j=1
				 if(arr[i]==arr[j]) {
					 //System.out.println("sameElement of the array is "+ arr[i]);
				 }
				 
			}//j++
			 System.out.println("sameElement of the array is "+ arr[i]);
		}//i++
	}
}
