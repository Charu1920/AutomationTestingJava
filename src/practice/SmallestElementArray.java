//Ques::find Second & third,4,5 Smallest Number in an Array 
package practice;

public class SmallestElementArray {

	static int arr[]= {25,11,7,56,75,3,9};
	public static void main(String[] args) {
		
		int smallest = arr[0];
		int secondsmallest =arr[0];
		int thirdsmallest =arr[0];
		int fourthsmallest =arr[0];
		int fifthsmallest =arr[0];
		//arr.length=5;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				fifthsmallest = fourthsmallest;
				fourthsmallest = thirdsmallest;
				thirdsmallest = secondsmallest;
				secondsmallest = smallest;
				smallest=arr[i];
			}else if(arr[i]<secondsmallest && arr[i]!=smallest){
				fifthsmallest = fourthsmallest;
				fourthsmallest = thirdsmallest;
				thirdsmallest =secondsmallest;
				secondsmallest=arr[i];
		    }else if (arr[i]<thirdsmallest && arr[i]!=secondsmallest && arr[i]!=smallest){
		    	fifthsmallest = fourthsmallest;
                fourthsmallest = thirdsmallest;
				thirdsmallest=arr[i];
		    }else if (arr[i]<fourthsmallest && arr[i]!=thirdsmallest && arr[i]!=secondsmallest && arr[i]!=smallest){
		    	fifthsmallest = fourthsmallest;
		    	fourthsmallest = arr[i];
		    	
		    }else if (arr[i]<fourthsmallest && arr[i]!=thirdsmallest && arr[i]!=secondsmallest && arr[i]!=smallest) {
		    	fifthsmallest =arr[i];
		    }
	 }
		System.out.println("smallest element of the array is "+ smallest);
		System.out.println("Secondsmallest element of the array is "+ secondsmallest);
		System.out.println("Thridsmallest element of the array is "+ thirdsmallest);
		System.out.println("fourthsmallest element of the array is "+ fourthsmallest);
		System.out.println("fifthsmallest element of the array is "+ fifthsmallest);
	}
}
