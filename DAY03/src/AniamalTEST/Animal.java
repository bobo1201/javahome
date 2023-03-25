package AniamalTEST;

public class Animal {
	private String name;
	
	public Animal(){
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eattingFood(String food) {
		System.out.println(name+", 음식 " + food + "를 먹었습니다.");
	}
	
	public void move(int x, int y) {
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}