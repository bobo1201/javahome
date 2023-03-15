package JAVA1217;

public class ex06_07 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2, 2));
	}
}

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		double dis = Math.pow(x1 - x , 2) + Math.pow(y1 - y, 2);
		return Math.sqrt(dis);
	}
}
