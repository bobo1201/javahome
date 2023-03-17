package JAVA1213;

import java.util.Scanner;

public class studentDriver1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//첫 번째 학생을 나타내는 객체를 만든다.
		student stud1 = new student();
		
		System.out.print("학생의 이름을 입력하세요 : ");
		stud1.name = scan.next();
		
		System.out.print("학생의 과제 점수를 입력하세요 : ");
		stud1.assignmentScore = scan.nextInt();
		
		System.out.print("학생의 시험 점수를 입력하세요 : ");
		stud1.examScore = scan.nextInt();
		
		System.out.println(stud1.toString());
		
		
		student stud2 = new student();
		
		System.out.print("학생의 이름을 입력하세요 : ");
		stud2.name = scan.next();
		
		System.out.print("학생의 과제 점수를 입력하세요 : ");
		stud2.assignmentScore = scan.nextInt();
		
		System.out.print("학생의 시험 점수를 입력하세요 : ");
		stud2.examScore = scan.nextInt();
		
		System.out.println(stud2.toString());
		
	}
}
