import java.util.Scanner;

public class PrimeNumber2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int ptr = 0;
		
		System.out.print("������ ���� �Է��ϼ��� : ");
		int endN = sc.nextInt();
		int[] prime = new int[endN];
		
		prime[ptr++] = 2;
		
		for(int n = 3; n<= endN; n += 2) {
			int i;
			for(i = 1; i < ptr; i++) {
				cnt++;
				if(n % prime[i] == 0) {
					break;
				}
			}
			if(ptr == i) {
				prime[ptr++] = n;
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("�������� ������ Ƚ�� : " + cnt);

	}

}
