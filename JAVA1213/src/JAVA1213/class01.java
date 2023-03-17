package JAVA1213;

class car{
	boolean powerOn;//시동
	String color; // 차량의 색상
	int wheel; // 바퀴의 수
	int speed; // 속력
	boolean wiperOn;// 와이퍼
	
	void power( ) { powerOn = !powerOn;} // 시동 메서드
	void speedUp( ) { speed++; } // 액셀 메서드
	void speedDown( ) { speed--; } // 브레이크 메서드
	void wiper( ) { wiperOn = !wiperOn; } // 와이퍼 메서드
}


public class class01 {

	public static void main(String[] args) {
		 car mycar = new car( );
		 System.out.println("시동 처음 초기화:"+mycar.powerOn);
		 System.out.println("차의 색상 초기화:"+mycar.color);
		 System.out.println("바퀴의 수 초기화:"+mycar.wheel);
		 System.out.println("속력 초기화:"+mycar.speed);
		 System.out.println("와이퍼 작동 초기화:"+mycar.wiperOn);
		 
		 mycar.power( ); // 시동 메서드 실행
		 System.out.println("시동 메서드 동작:"+mycar.powerOn);
		 mycar.power( ); // 시동 메서드 실행
		 System.out.println("시동 메서드 다시 동작:"+mycar.powerOn);
		 
		 mycar.color = "black"; // 색상 변수에 black 대입
		 System.out.println("현재 차의 색상:"+mycar.color);
		 
		 car mycar1 = new car( ); // car 인스턴스 생성
		 car mycar2 = new car( ); // car 인스턴스 하나 더 생성
		 mycar1.color = "red"; // mycar1의 색상 빨강
		 mycar2.color = "black"; // mycar2의 색상 검정
		 mycar1.speedUp( ); // mycar1 액셀 메서드 호출
		 
		 mycar2.wiper( ); // mycar2 와이퍼 메서드 호출
		 System.out.println("mycar1의 색 : "+mycar1.color);
		 System.out.println("mycar2의 색 : "+mycar2.color);
		 System.out.println("mycar1의 속도 : "+mycar1.speed);
		 System.out.println("mycar2의 속도 : "+mycar2.speed);
		 System.out.println("mycar1의 와이퍼 작동 여부 : "+mycar1.wiperOn);
		 System.out.println("mycar2의 와이퍼 작동 여부 : "+mycar2.wiperOn);
		}
}
