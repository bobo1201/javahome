import java.util.Scanner;

public class D05 {
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int substract(int a, int b) {
		return a-b;
	}
	public static int multiple(int a, int b) {
		return a*b;
	}
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static int calc(int a, char operate, int b) {
		if(operate == '+') {
			return add(a,b);
		}
		else if(operate == '-') {
			return substract(a,b);
		}
		else if(operate == '*') {
			return multiple(a,b);
		}
		else if(operate == '/') {
			return divide(a,b);
		}
		else {
			return -99999;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char operate = scanner.next().charAt(0);
		int b = scanner.nextInt();
		
		System.out.println(calc(a, operate, b));
	}	
}