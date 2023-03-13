package JAVA1218;

public class ex03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fahrenheit = 100;
		float celcius = (float)Math.round((float)5/9*(fahrenheit - 32)*100)/100;
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}
