import java.util.Scanner;

public class BinSearchX {
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			
			if(a[pc] == key) {
				for(int i=1; true; i++) {
					if(pc == 0) {
						return pc;
					}
					
					if(a[pc - i] != a[pc]) {
						return pc - i + 1;
					}
				}
			} else if(a[pc] < key){
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		} while(pl <= pr);
		
		return -1; // �˻� ����
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int ky = sc.nextInt();
		
		int idx = binSearchX(x, num, ky);
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}
		
	}
}
