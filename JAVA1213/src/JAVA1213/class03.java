package JAVA1213;


class Cars{
static int wheel = 4; // Ŭ��������
int speed; // �ν��Ͻ� ����
}

public class class03 {

	
	public static void main(String[] args) {
		 System.out.println(Cars.wheel); // Ŭ���� ���� ���� ����
		 // System.out.println(cars.speed); // �����߻�! �ν��Ͻ� ���� ���� �Ұ�
		 
		 Cars myCar1 = new Cars( );
		 System.out.println(Cars.wheel);
		 System.out.println(myCar1.speed); // �ν��Ͻ� ���� �Ŀ��� ���� ����
		 Cars myCar2 = new Cars( );
		 
		 System.out.println("< ���� �� >");
		 System.out.println("myCar1.speed : "+ myCar1.speed);
		 System.out.println("myCar2.speed : "+ myCar2.speed);
		 System.out.println("myCar1.wheel : "+ myCar1.wheel);
		 System.out.println("myCar2.wheel : "+ myCar2.wheel);
		 
		 myCar2.speed = 100;
		 myCar2.wheel = 5;
		 System.out.println("< ���� �� >");
		 System.out.println("myCar1.speed : "+ myCar1.speed);
		 System.out.println("myCar2.speed : "+ myCar2.speed);
		 System.out.println("myCar1.wheel : "+ myCar1.wheel);
		 System.out.println("myCar2.wheel : "+ myCar2.wheel);
		} 
}
