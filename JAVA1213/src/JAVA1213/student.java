package JAVA1213;

public class student {

	public String name;                //�̸�
	public int assignmentScore;        //���� ����
	public int examScore;              //���� ����
	
	public String toString() {
		String str = "";
		str += "�̸� : " + name + "\n";
		str += "���� ���� : " + assignmentScore + "\n";
		str += "���� ���� : " + examScore + "\n";
		str += "���� : " + getGrade() + "\n";
		return str;
	}
	
	public char getGrade() {
		
		char letterGrade;             //�л��� ����
		double total;                 //�л��� ����
		
		total = assignmentScore * 0.4 + examScore * 0.6;
		
		//������ ���� �����ο�
		
		if(total >= 90) letterGrade = 'A';
		else if(total >= 80) letterGrade = 'B';
		else if(total >= 70) letterGrade = 'C';
		else if(total >= 60) letterGrade = 'D';
		else letterGrade = 'F';
		
		return letterGrade;
	}
}
