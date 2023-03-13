package JAVA1218;

public class ex03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 10;
		byte b = 20;
		int c = a + b;
		
		char ch = 'A';
		ch = (char)((int)ch + 2) ;
		
		float f = (float)3 / 2;
		long l = 3000 * 3000 * 3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}
