package practice;

public class BankloanEligibility {

	public static void main(String[] args) {
      boolean  stablejob = false;
      float salary = 40000;
      float saving = 300000;
      if(stablejob) {
    	  if(salary > 50000) {
    		  System.out.println("you are eigible for loan");
    	  }else {
    	      System.out.println("you are not eigible for loan because ur salary not enough");
          }
    	  
      }else {
    	  if(saving > 500000) {
    		  System.out.println("you are eigible for loan");
        		  
           }else {
        	  System.out.println("you are not eigible for loan because ur saving not enough for laon");
           }
 
	}
}

}
/*5. Bank Loan Eligibility
Write a program to determine if a person is eligible for a bank loan:

If the person has a stable job, check:

If their salary > ₹50,000: Loan eligible.

Else: Not eligible.


If not, check if they have significant savings (> ₹5 Lakh):

If yes, loan eligible.

Else, not eligible.*/