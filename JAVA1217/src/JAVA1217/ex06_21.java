package JAVA1217;

public class ex06_21 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);

		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
	}
}

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	void turnOff() {
		this.isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(volume < MAX_VOLUME) {
			this.volume++;
		}
	}
	
	void volumeDown() {
		if(volume > MIN_VOLUME) {
			this.volume--;
		}
	}
	
	void channelUp() {
		this.channel++;
		
		if(channel == MAX_CHANNEL) {
			this.channel = MIN_CHANNEL;
		}
	}
	
	void channelDown() {
		this.channel--;
		
		if(channel == MIN_CHANNEL) {
			this.channel = MAX_CHANNEL;
		}
	}
}
