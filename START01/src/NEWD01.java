import java.util.Scanner;

public class NEWD01 {
	
	final public static int KIWI = 1;
	final public static int APPLE = 2;
	final public static int PEAR = 3;
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int discount(int a, int b) {
		return a*b/100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int arr[] = new int[1000];
		int count = 0;
		
		while(true) {
			int n = scanner.nextInt();
			
			if(n==0) {
				break;
			}
			else {
				arr[count] = n;
				count++;
			}
//			System.out.println("count : " + count);
//			System.out.println("n : " + n);
		}
		
		int price[] = new int[count];
		
		for(int i=0; i<count ;i++) {
			if(arr[i] == 1) {
				price[i] = 5000;
			}
			else if(arr[i] == 2) {
				price[i] = 7000;
			}			
			else if(arr[i] == 3) {
				price[i] = 10000;
			}
			else {
				System.out.println("¿¡·¯");
			}
		}
		
		int sum = 0;
		for(int i=0; i<price.length; i++) {
			sum = sum + price[i];
			System.out.println("pirce[i] : " + price[i]);
		}
		
		if(sum >= 100000) {
			sum = (int)(sum*0.8);
		}
		else if(sum >= 50000) {
			sum = (int)(sum*0.9);
		}		
		if(sum >= 10000) {
			sum = (int)(sum*0.95);
		}
		
		System.out.println(sum);
	}
}
