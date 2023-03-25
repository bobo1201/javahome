package day03;

import java.util.ArrayList;

public class Subway {
	int subwayNumber;
	int passengerCount;
	int money;
	ArrayList<String> passengerList;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber; 
		passengerList = new ArrayList<>();
	}
	
	public void take(String name, int money) {
		this.money += money;
		passengerCount++;
		passengerList.add(name);
	}
	
	public void printInfo() {
		System.out.println("����ö " + subwayNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
		
		System.out.println("���� ž�� �°��� �̸��� ������ �����ϴ�.");
		for(int i=0; i<passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
	}
}
