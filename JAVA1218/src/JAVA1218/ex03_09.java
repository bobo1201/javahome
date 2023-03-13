package JAVA1218;

public class ex03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'p';
		boolean b = ((ch>= 65 && ch<=90) || (ch>=97 && ch<=122) || (ch >= 48 && ch <= 57)) ? true : false;
		
		System.out.println(b);
	}
}
