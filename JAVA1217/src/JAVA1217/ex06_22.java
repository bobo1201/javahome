package JAVA1217;

public class ex06_22 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));

		str = "1234o";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
	}
	
	static boolean isNumber(String str){
		boolean a = true;
		if(str != null && str != "") {
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					a = true;
				} else {
					a = false;
				}
			}			
		} else {
			a = false;
		}
		return a;
	}
}