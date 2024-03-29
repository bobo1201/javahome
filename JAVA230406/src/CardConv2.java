import java.util.Scanner;

public class CardConv2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
			} while(no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt();
			} while(cd < 2 || cd > 36);
		
		dno = cardConv(no, cd, cno);
		
		System.out.print(cd + "진수로");
		for(int i=0; i<dno; i++) {
			System.out.print(cno[i]);
		}
		System.out.println("입니다.");
		
		System.out.print("한 번 더 할까요? (1...예/0...아니요): ");
		retry = sc.nextInt();
		} while(retry == 1); 
		

	}
	
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {

			System.out.print(r + "|      " + x);
			if(digits == 0) {
				System.out.println();
			} else {
				System.out.println("  ..." + d[digits-1]);
			}
			
			d[digits++] = dchar.charAt(x % r);

			x /= r;
			System.out.println(" + ---------");				

			
			if(x == 0) {
				System.out.println("        " + x + "  ...1");
			}
		} while(x != 0);
		
		for(int i=0; i<digits/2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		return digits;
	}

}
