package JAVA1218;

public class ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (int)Math.ceil((float)numOfApples / sizeOfBucket);
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
	}
}
