package java1208;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
		
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		}
		
		avg = (double)sum / cnt;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}