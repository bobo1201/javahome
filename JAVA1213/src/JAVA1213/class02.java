package JAVA1213;

class Area{
	static void manual() {
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.println("triangle : �ﰢ�� ����");
		System.out.println("rectangle : �簢�� ����");
		System.out.println("�Դϴ�.");
	}
	
	double triangle(int a, int b){
		return (double)a*b/2;
	}
	int rectangle(int a, int b) {
		return a*b;
	}
}

public class class02 {

	public static void main(String[] args) {
		Area.manual();
//		Area.triangle(3,5);
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
	} 
}
