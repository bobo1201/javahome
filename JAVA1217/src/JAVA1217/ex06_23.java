package JAVA1217;

public class ex06_23 {

	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {}));
	}
	
	static int max(int[] arr) {
		int temp = 0;
		if(arr != null && arr.length != 0) {
			for(int i=0; i< arr.length; i++) {
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
				}
				if(i == arr.length-2) { break; }
			}
		} else {
			temp = -999999;
		}
		return temp;
	}
}