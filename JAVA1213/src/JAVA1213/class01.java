package JAVA1213;

class car{
	boolean powerOn;//�õ�
	String color; // ������ ����
	int wheel; // ������ ��
	int speed; // �ӷ�
	boolean wiperOn;// ������
	
	void power( ) { powerOn = !powerOn;} // �õ� �޼���
	void speedUp( ) { speed++; } // �׼� �޼���
	void speedDown( ) { speed--; } // �극��ũ �޼���
	void wiper( ) { wiperOn = !wiperOn; } // ������ �޼���
}


public class class01 {

	public static void main(String[] args) {
		 car mycar = new car( );
		 System.out.println("�õ� ó�� �ʱ�ȭ:"+mycar.powerOn);
		 System.out.println("���� ���� �ʱ�ȭ:"+mycar.color);
		 System.out.println("������ �� �ʱ�ȭ:"+mycar.wheel);
		 System.out.println("�ӷ� �ʱ�ȭ:"+mycar.speed);
		 System.out.println("������ �۵� �ʱ�ȭ:"+mycar.wiperOn);
		 
		 mycar.power( ); // �õ� �޼��� ����
		 System.out.println("�õ� �޼��� ����:"+mycar.powerOn);
		 mycar.power( ); // �õ� �޼��� ����
		 System.out.println("�õ� �޼��� �ٽ� ����:"+mycar.powerOn);
		 
		 mycar.color = "black"; // ���� ������ black ����
		 System.out.println("���� ���� ����:"+mycar.color);
		 
		 car mycar1 = new car( ); // car �ν��Ͻ� ����
		 car mycar2 = new car( ); // car �ν��Ͻ� �ϳ� �� ����
		 mycar1.color = "red"; // mycar1�� ���� ����
		 mycar2.color = "black"; // mycar2�� ���� ����
		 mycar1.speedUp( ); // mycar1 �׼� �޼��� ȣ��
		 
		 mycar2.wiper( ); // mycar2 ������ �޼��� ȣ��
		 System.out.println("mycar1�� �� : "+mycar1.color);
		 System.out.println("mycar2�� �� : "+mycar2.color);
		 System.out.println("mycar1�� �ӵ� : "+mycar1.speed);
		 System.out.println("mycar2�� �ӵ� : "+mycar2.speed);
		 System.out.println("mycar1�� ������ �۵� ���� : "+mycar1.wiperOn);
		 System.out.println("mycar2�� ������ �۵� ���� : "+mycar2.wiperOn);
		}
}
