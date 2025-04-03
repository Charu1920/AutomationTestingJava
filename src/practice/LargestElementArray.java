//find Second Largest Number in an Array
package practice;

public class LargestElementArray {

	static int arr[]= {25,11,7,56,75,79,92,103,100,69,98};
	
	public static void main(String[] args) {
		int largest = arr[0];
		int Secondlargest =arr[0];
		int thirdlargest = arr[0];
		int fourthlargest = arr[0];
		//arr.length=5;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				fourthlargest = thirdlargest;
				thirdlargest = Secondlargest;
				Secondlargest =largest;
				largest=arr[i];
			}else if(arr[i]>Secondlargest && arr[i]!=largest) {
				fourthlargest = thirdlargest;
				thirdlargest = Secondlargest;
				Secondlargest =arr[i];
			}else if(arr[i]>thirdlargest && arr[i]!=Secondlargest && arr[i]!=largest) {
				fourthlargest = thirdlargest;
				thirdlargest = Secondlargest;
				thirdlargest = arr[i];
			}else if(arr[i]>fourthlargest &&arr[i]!=thirdlargest && arr[i]!=Secondlargest && arr[i]!=largest) {
				fourthlargest = arr[i];
				
			}
		}
		System.out.println("largest element of the array is "+ largest);
		System.out.println("Secondlargest element of the array is "+ Secondlargest);
		System.out.println("Thirdlargest element of the array is "+ thirdlargest);
		System.out.println("fourthlargest element of the array is "+ fourthlargest);
	}

}
