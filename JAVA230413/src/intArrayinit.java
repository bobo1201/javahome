import java.util.Scanner;

public class intArrayinit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = {1, 2, 3, 4, 5};

		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
