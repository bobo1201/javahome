import java.util.Scanner;

public class IntQueue {
   private int[] que;
   private int capacity;
   private int front;
   private int rear;
   private int num;
   
   
   // 큐가 비어있음
   public class EmptyIntQueueException extends RuntimeException{
      public EmptyIntQueueException() {}
   }
   
   
   // 큐가 가득 참
   public class OverflowIntQueueException extends RuntimeException{
      public OverflowIntQueueException() {}
   }
   
   
   // 생성자
   public IntQueue(int maxlen) {
      num = front = rear = 0;
      capacity = maxlen;
      try {
         que = new int[capacity];
      } catch(OutOfMemoryError e) {
         capacity = 0;
      }
   }
   
   
   public int enque(int x) throws OverflowIntQueueException{
      if(num >= capacity)
         throw new OverflowIntQueueException();
      que[rear++] = x;
      num++;
      if(rear == capacity)
         rear = 0;
      return x;
   }
   
   
   public int deque() throws EmptyIntQueueException{
      if(num <= 0)
         throw new EmptyIntQueueException();
      int x = que[front++];
      num--;
      if(front == capacity)
         front = 0;
      return x;
   }
   
   
   public int peek() throws EmptyIntQueueException{
      if(num <= 0)
         throw new EmptyIntQueueException();
      return que[front];
   }
   
   
   public void clear() {
      num = front = rear = 0;
   }
   
   public int indexOf(int x) {
      for(int i=0; i<num; i++) {
         int idx = (i + front) % capacity;
         if(que[idx] == x)
            return idx;
      }
      
      return -1;
   }
   
   public int getCapacity() {
      return capacity;
   }
   
   public int size() {
      return num;
   }
   
   public boolean isEmpty() {
      return num <= 0;
   }
   
   public boolean ifFull() {
      return num >= capacity;
   }
   
   public void dump() {
      if(num <= 0)
         System.out.println("큐가 비어 있습니다.");
      else {
         for(int i=0; i<num; i++)
            System.out.print(que[(i+front) % capacity] + " ");
         System.out.println();
      }
   }
   
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      IntQueue s = new IntQueue(64);
      
      while(true) {
         System.out.println();
         System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
         System.out.print("(1) 인큐  (2) 디큐  (3) 피크  (4) 덤프  (0) 종료 : ");
         
         int menu = sc.nextInt();
         if(menu == 0) break;
         
         int x;
         switch(menu) {
         case 1:
            System.out.print("데이터 : ");
            x = sc.nextInt();
            try {
               s.enque(x);
            } catch(IntQueue.OverflowIntQueueException e){
               System.out.println("큐가 가득 찼습니다.");   
            }
            break;
            
         case 2:
            try {
               x = s.deque();
               System.out.println("디큐한 데이터는 " + x + "입니다.");
            } catch(IntQueue.EmptyIntQueueException e) {
               System.out.println("큐가 비어 있습니다.");
            }
            break;
            
         case 3:
            try {
               x = s.peek();
               System.out.println("피크한 데이터는 " + x + "입니다.");
            } catch (IntQueue.EmptyIntQueueException e) {
               System.out.println("큐가 비어 있습니다.");
            }
            break;
            
         case 4:
            s.dump();
            break;
         }
      }
   }
}