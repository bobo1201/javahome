package JAVA1213;

public class studentDriver {

	public static void main(String[] args) {
		
		//첫 번째 학생을 나타내는 객체를 만든다.
		student stud1 = new student();
		
		stud1.name = "선남";
		stud1.assignmentScore = 91;
		stud1.examScore = 84;
		System.out.println(stud1.toString());
		
		
		student stud2 = new student();
		
		stud2.name = "선녀";
		stud2.assignmentScore = 86;
		stud2.examScore = 84;
		System.out.println(stud2.toString());
		
		
	}
}
