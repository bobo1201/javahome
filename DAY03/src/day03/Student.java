package day03;

public class Student {
	
	String studentName;
	int grade;
	int money;
	boolean rideStatus;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		rideStatus = false;
	}
	
	public boolean takeBus(Bus bus) {
		if(isRideStatus()) {
			System.out.println("������ �̿��ϰ� �ִ� �����Դϴ�.");
			return false;
		}
		else {
			System.out.println("bus ž��");
			bus.take(this.studentName, 1000);
			money -= 1000;
			this.rideStatus = true;
			return true;
		}
	}
	
	public void takeOffRide() {
		this.rideStatus = false;
	}
	
	public boolean takeSubway(Subway subway) {
		if(isRideStatus()) {
			System.out.println("������ �̿��ϰ� �ִ� �����Դϴ�.");
			return false;
		}
		else {
			System.out.println("subway ž��");
			subway.take(this.studentName, 1200);
			money -= 1200;
			this.rideStatus = true;
			return true;
		}
	}
	
	public void printInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�.");
	}
	
	private boolean isRideStatus() {
		return this.rideStatus ? true : false;
	}

}
