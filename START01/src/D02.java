import java.util.Scanner;

public class D02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1.equals("hello"));
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		String a = "Hello Java";
		
		System.out.println(a.indexOf("Java"));
		System.out.println(a.contains("Java"));
		
		String b = "a:b:c:d";
		String[] result = b.split(":");
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
	}
}
