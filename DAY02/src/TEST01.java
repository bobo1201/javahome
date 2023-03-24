
public class TEST01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
