package JAVA1213;

public class Employee {

	public String name;
	public int number;
	public int age;
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		String str = "";
		str += "�̸� : " + name + "\n";
		str += "��ȣ : " + number + "\n";
		str += "���� : " + age + "\n";
		return str;
	}
	
	public void setName(String Name) {
		name = Name;
	}
	
	public void setNumber(int Number) {
		number = Number;
	}
	
	public void setAge(int Age) {
		age = Age;
	}	
}
