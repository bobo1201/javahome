package JAVA1213;

public class studentDriver {

	public static void main(String[] args) {
		
		//ù ��° �л��� ��Ÿ���� ��ü�� �����.
		student stud1 = new student();
		
		stud1.name = "����";
		stud1.assignmentScore = 91;
		stud1.examScore = 84;
		System.out.println(stud1.toString());
		
		
		student stud2 = new student();
		
		stud2.name = "����";
		stud2.assignmentScore = 86;
		stud2.examScore = 84;
		System.out.println(stud2.toString());
		
		
	}
}
