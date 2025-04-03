package practice;

public class Temprature {

	public static void main(String[] args) {
		
		//Celtofar(27); //static methods calling 
		float Celsius = Celtofar(27);
		System.out.println("farenhiteResult " + Celsius);
		
		Temprature farenhiteResult = new Temprature();
		float Cels = farenhiteResult.FarenhiteToCelsius(77); //Non-static methods calling
		System.out.println("Celsius " + Cels);
}
	
	public static float Celtofar(float Cel) {
		return (Cel * 9/5) + 32;     //static Methods
		
	}
	
	public float FarenhiteToCelsius(float f) {
		return (f - 32) * 5/9 ; //Non-static Methods
		
	}

}
