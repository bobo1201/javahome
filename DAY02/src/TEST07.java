import java.util.Scanner;

public class TEST07 {

	/*  1. 변수를 하나 생성한다
	 *  2. 빈칸에 따라 배열을 하나 생성한다.
	 *  3. 각각의 배열의 첫글자가 대문자로 바뀌게 한다.
	 *  4. 모든 글자를 이어준다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String word1 = word.toLowerCase();
		String[] split = word1.split(" ");
		String result = "";
		
		for(int i = 0; i < split.length; i++) {
			if(i > 0) {
				result = split[i].substring(0,1).toUpperCase();
				split[i] = result + split[i].substring(1);
			}
			else {
			}
		}
		
		for(int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		
		
		

	}

}
