package practice;

public class Array1 {

	public static void main(String[] args) {
        int a1 = 1;
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(a1);
        System.out.println(a[8]);
	System.out.println("test comment");
        
        String arr[] = {"aman", "charu", "pawan","mohit","deepak"};
        System.out.println(arr[4]); // deepak
        //System.out.println(arr[5]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        
        Object arr2[] = {"Charu",1,1.0, true,10000,'p'};
        System.out.println(arr2[3]);

	}

}
