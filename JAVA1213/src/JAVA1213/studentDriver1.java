package JAVA1213;

import java.util.Scanner;

public class studentDriver1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//ù ��° �л��� ��Ÿ���� ��ü�� �����.
		student stud1 = new student();
		
		System.out.print("�л��� �̸��� �Է��ϼ��� : ");
		stud1.name = scan.next();
		
		System.out.print("�л��� ���� ������ �Է��ϼ��� : ");
		stud1.assignmentScore = scan.nextInt();
		
		System.out.print("�л��� ���� ������ �Է��ϼ��� : ");
		stud1.examScore = scan.nextInt();
		
		System.out.println(stud1.toString());
		
		
		student stud2 = new student();
		
		System.out.print("�л��� �̸��� �Է��ϼ��� : ");
		stud2.name = scan.next();
		
		System.out.print("�л��� ���� ������ �Է��ϼ��� : ");
		stud2.assignmentScore = scan.nextInt();
		
		System.out.print("�л��� ���� ������ �Է��ϼ��� : ");
		stud2.examScore = scan.nextInt();
		
		System.out.println(stud2.toString());
		
	}
}
