
public class Exercise7_1 {
    
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        
        for(int i=0; i<deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
        
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
        
class SutdaDeck{
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    
    SutdaDeck() {    	
    	for(int i=0; i<cards.length; i++) {
    		if(i == 0 || i == 2 || i == 7) {
    			cards[i] = new SutdaCard(i+1, true);
    		} else {
    			cards[i] = new SutdaCard((i)%10+1, false);
    		}
    	}
    }
    
    void shuffle(){
    	for(int i=0; i<cards.length; i++) {
    		SutdaCard temp;
    		int a = (int)(Math.random()*20);
    		temp = cards[i];
    		cards[i] = cards[a];
    		cards[a] = temp;
    	}
    }
    
    SutdaCard pick(){
    	int a = (int)(Math.random()*20);
    	SutdaCard b = cards[a];
    	return b;
    }
    
    SutdaCard pick(int index){
    	SutdaCard b = cards[index];
    	return b;
    }
}

class SutdaCard{
    int num;
    boolean isKwang;
    
    SutdaCard(){
        this(1, true);
    }
    
    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    
    // info() 대신 Object 클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K":"");
    }
}