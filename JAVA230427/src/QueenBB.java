import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueenBB {
	static boolean[] flag = new boolean[8];
	static int[] pos = new int[8]; // �� ���� �ִ� ���� ��ġ
	
	 // �� ���� �ִ� ���� ��ġ ���
	static void print() {
		for(int i=0; i<8; i++){
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	
	static void set(int i) {
		for(int j=0; j < 8; j++) {
			if(flag[j] == false) {	// j�࿡ ���� ���� ��ġ���� ����
				pos[i] = j;	// ���� j�࿡ ��ġ 
				if(i == 7)	// ��� ���� ��ġ
					print();				
				else {
					flag[j] = true;
					set(i+1); // ���� ���� ���� ��ġ
					flag[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
	
}