import java.util.Scanner;

public class oxQuiz {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum[] = new int[num];

		
		for(int i=0; i<num; i++) {
			String input = sc.next();
			
			int cnt = 1;
			
			for(char str : input.toCharArray()) {
				if(str == 'O') {
					sum[i] += cnt++;
				} else {
					cnt = 1;
				}
			}
		}
		
		for(int result : sum) {
			System.out.println(result);
		}
	}
}
