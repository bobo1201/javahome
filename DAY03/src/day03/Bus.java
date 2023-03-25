package day03;

import java.util.ArrayList;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	ArrayList<String> passengerList;
	
	private static int allOfBusCount;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber; 
		passengerList = new ArrayList<>();
		allOfBusCount++;
	}
	
	public void take(String name, int money) {
		this.money += money;
		passengerCount++;
		passengerList.add(name);
	}
	
	public void printInfo() {
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
		
		System.out.println("���� ž�� �°��� �̸��� ������ �����ϴ�.");
		for(int i=0; i<passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
	}
	
	public int getAllOfBusCount() {
		return allOfBusCount;
	}

	public int getBusNumber() {
		// TODO Auto-generated method stub
		return busNumber;
	}
	
}
