package JAVA1217;

public class ex06_06 {

	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	
	static double getDistance(int x, int y, int x1, int y1) {
		double dis = Math.pow(x1 - x , 2) + Math.pow(y1 - y, 2);
		return Math.sqrt(dis);
	}
}
