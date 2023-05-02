import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int cnt = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for(int i=5; i<=1000; i += 2) {
			boolean tf = false;
			for(int j=1; prime[j] * prime[j] <= i; j++) {
				cnt += 2;
				if(i % prime[j] == 0) {
					tf = true;
					break;
				}
			}
			if(!tf) {
				prime[ptr++] = i;
				cnt++;
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("°ö¼À°ú ³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö : " + cnt);
	}
}
