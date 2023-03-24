
public class TEST06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sum ="";
		
		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 2- i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");	
//			}
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
			for(int j = 0; j < i; j++) {
			System.out.print(" ");
			}
			for(int j = 0; j <= 2 - i; j++) {
				System.out.print("*");	
			}
			for(int j = 0; j < 2 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
