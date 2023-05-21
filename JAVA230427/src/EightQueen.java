import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EightQueen {
	static boolean[] flag_a = new boolean[8];
	static boolean[] flag_b = new boolean[15];
	static boolean[] flag_c = new boolean[15];
	static int[] pos = new int[8]; // 각 열에 있는 퀸의 위치
	
	 // 각 열에 있는 퀸의 위치 출력
	static void print() {
		for(int i=0; i<8; i++){
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	
	static void set(int i) {
		for(int j=0; j < 8; j++) {
			if(flag_a[j] == false && 
					flag_b[i+j]==false &&
					flag_c[i-j+7] == false) {	// j행에 퀸을 아직 배치하지 않음
				pos[i] = j;	// 퀸을 j행에 배치 
				if(i == 7)	// 모든 열에 배치
					print();				
				else {
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
					set(i+1); // 다음 열에 퀸을 배치
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
	
}