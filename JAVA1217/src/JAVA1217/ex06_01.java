package JAVA1217;

public class ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this.num = 1;
		this.isKwang = true;
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		if(isKwang) {
			return num + "K";
		} else {
			return num + "";
		}
	}
}