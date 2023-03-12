package JAVA1225;

import java.util.*;

public class DKD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int h=60*s.nextInt()+s.nextInt()+1395;
		System.out.print(h/60%24+" "+h%60);
	}

}
