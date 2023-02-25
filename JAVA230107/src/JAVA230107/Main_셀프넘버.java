package JAVA230107;

public class Main_셀프넘버 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int arr[] = new int[10050];
		arr[0] = 1;
		
		for(int i = 1; i <= 10000; i++) {
			a = i;
			b = a;
			
			while(a > 0) {
				b += (a%10);
				a /= 10;
			}
			arr[b] = b;
		}
		
		for(int i=0; i<= 10000; i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
