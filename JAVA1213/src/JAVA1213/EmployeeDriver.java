package JAVA1213;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.name = "이도령";
		emp1.number = 100;
		emp1.age = 25;
		
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee();
		
		emp2.setName("성춘향");
		emp2.setNumber(200);
		emp2.setAge(18);
		System.out.println(emp2.toString());
		emp2.setNumber(300);
		System.out.println(emp2.toString());
	}
}
