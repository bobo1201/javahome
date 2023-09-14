import java.util.Scanner;

public class SeqSearch2 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt = -1;
		for(int i=0; i<n; i++) {
			if(i == 0) {
				cnt = 0;
			}
			if(a[i] == key) {
				idx[cnt++] = i;				
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		int y[] = new int[num];
		
		for(int i=0; i<x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = sc.nextInt();
		
		int idx = searchIdx(x, num, ky, y);
		
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("��ġ�ϴ� ��Ҽ��� " + idx + "�� �Դϴ�.");
			for(int i=0; i<idx; i++) {
				System.out.println("�� ���� idx[" + y[i] + "]�� �ֽ��ϴ�.");				
			}
		}
	}
}
