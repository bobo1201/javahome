package Abstract;

/*
 * �߻�Ŭ���� & �߻�޼���
 * 
 * 1. ����Ŭ������ �߻�Ŭ������ ���, ����Ŭ������ ����Ŭ������ ��� �߻�޼��带 �����ؾ��Ѵ�.
 * 2. ����Ŭ������ �߻�Ŭ������ ���, ����Ŭ������ ���������� �߻�Ŭ�������,
 * 		�� �ؿ� �����ϴ� �ڽ�Ŭ�������� �߻�޼��� ������ �̷��.
 * 		�׷��Ƿ� �߻�Ŭ������ ����Ŭ�������� ������ ��� �߻�޼��带 ������ �ǹ��� �ڽĿ��� �ѱ� �� �ִ�.
 * 3. �߻�Ŭ������ ���������� �ν��Ͻ�ȭ �� �� ����. (new ���)
 */

public class Test01 {

	public static void main(String[] args) {
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		

		c2.display();
		c2.typing();
		c4.display();
		c4.typing();
	}

}
