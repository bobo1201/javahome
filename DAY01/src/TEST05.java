
public class TEST05 {

	public static void main(String[] args) {
		int arr[] = {5, 10, 23, 1, 22};
		int max = 0;

		for(int i = 0; i < arr.length ; i++ ) {
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}