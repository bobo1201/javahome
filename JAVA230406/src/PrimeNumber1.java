import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		int cnt = 0;
		
		for(int n = 2; n<= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				cnt++;
				if(n % i == 0) {
					break;
				}
			}
			if(n == i) {
				System.out.println(n);
			}
		}
		
		System.out.println("�������� ������ Ƚ�� : " + cnt);

	}

}
