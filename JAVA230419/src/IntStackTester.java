import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IntStackTester {
	
	public static class IntStack{
		private int[] stk;
		private int capacity;
		private int ptr;
		
		public class EmptyIntStackException extends RuntimeException{
			public EmptyIntStackException() {}
		}
		
		public class OverflowIntStackException extends RuntimeException{
			public OverflowIntStackException() {}
		}
		
		
		public IntStack(int maxlen) {
			ptr = 0;
			capacity = maxlen;
			try {
				stk = new int[capacity];
			} catch(OutOfMemoryError e) {
				capacity = 0;
			}
		}
		
		public int push(int x) throws OverflowIntStackException {
			if(ptr >= capacity) {
				throw new OverflowIntStackException();
			}
			
			return stk[ptr++] = x;
		}
		
		public int pop() throws EmptyIntStackException {
			if(ptr <= 0) {
				throw new EmptyIntStackException();
			}
			
			return stk[--ptr];
		}
		
		public int peek() throws EmptyIntStackException {
			if(ptr <= 0) {
				throw new EmptyIntStackException();
			}
			
			return stk[ptr - 1];
		}
		
		public void clear() {
			ptr = 0;
		}
		
		public int indexOf(int x) {
			for(int i = ptr - 1; i >= 0; i--) {
				if(stk[i] == x) {
					return i;
				}
			}
			return -1;
		}
		
		public int getCapacity() {
			return capacity;
		}
		
		public int size() {
			return ptr;
		}
		
		public boolean isEmpty() {
			return ptr <= 0;
		}
		
		public boolean isFull() {
			return ptr >= capacity;
		}
		
		public void dump() {
			if(ptr <= 0) {
				System.out.println("������ ��� �ֽ��ϴ�.");
			} else {
				for(int i=0; i < ptr; i++) {
					System.out.print(stk[i] + " ");
				}
				System.out.println();
			}
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println();
			System.out.printf("���� ������ ���� : %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1) Ǫ��  (2) ��  (3) ��ũ  (4) ����  (0) ���� : ");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("������: ");
				x = sc.nextInt();
				
				try {
					s.push(x);
				} catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");

				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
				
			case 4:
				s.dump();
				break;
			}
		}
	}
}
