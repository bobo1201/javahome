package JAVA1213;

public class student {

	public String name;                //이름
	public int assignmentScore;        //과제 점수
	public int examScore;              //시험 점수
	
	public String toString() {
		String str = "";
		str += "이름 : " + name + "\n";
		str += "과제 점수 : " + assignmentScore + "\n";
		str += "시험 점수 : " + examScore + "\n";
		str += "학점 : " + getGrade() + "\n";
		return str;
	}
	
	public char getGrade() {
		
		char letterGrade;             //학생의 학점
		double total;                 //학생의 총점
		
		total = assignmentScore * 0.4 + examScore * 0.6;
		
		//총점에 따른 학점부여
		
		if(total >= 90) letterGrade = 'A';
		else if(total >= 80) letterGrade = 'B';
		else if(total >= 70) letterGrade = 'C';
		else if(total >= 60) letterGrade = 'D';
		else letterGrade = 'F';
		
		return letterGrade;
	}
}
