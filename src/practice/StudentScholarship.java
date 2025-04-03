package practice;

public class StudentScholarship {

	public static void main(String[] args) {
      int Marks = 55;
      
      if(Marks>=90) {
    	  System.out.println("Full Scholarship");
      }else if(Marks >= 75) {
    	  System.out.println("50% Scholarship");
      }else if(Marks >= 60) {
    	  System.out.println("25% Scholarship");
      }else  {
		  System.out.println("No Scholarship");
	  }

 }
}
/*4. Student Scholarship
Write a program to check if a student qualifies for a scholarship:

Marks >= 90: "Full Scholarship."

Marks >= 75: "50% Scholarship."

Marks >= 60: "25% Scholarship."

Else: "No Scholarship." Also, if the student is from a rural background, add an additional 10% scholarship in all cases.  */