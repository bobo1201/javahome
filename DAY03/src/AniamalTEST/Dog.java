package AniamalTEST;


public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void eattingFood(String food) {
		super.eattingFood(food);
		System.out.println(super.getName() +" �Ľ��� �԰� �ͽ��ϴ�");
	}
}