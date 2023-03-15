package JAVA1217;

public class ex06_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		int sum = kor + eng + math;
		float avg = Math.round(sum/(float)3*10)/(float)10;
		String arr = name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
		return arr + ", " + sum + ", " + avg;
	}
		
}