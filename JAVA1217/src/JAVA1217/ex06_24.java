package JAVA1217;

public class ex06_24 {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"�� ���밪:"+abs(value));
		value = -10;
		System.out.println(value+"�� ���밪:"+abs(value));
	}
	
	static int abs(int value) {
		value = Math.abs(value);
		
		return value;
	}
}