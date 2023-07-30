import java.util.Comparator;

public class LinkedList<E> {
	
	class Node<E>{
		private E data;			// 데이터
		private Node<E> next;	// 뒤쪽 포인터(다음 노드 참조)
		
		Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head;	// 머리 포인터(머리 노드 참조)
	private Node<E> crnt;	// 선택 포인터(선택 노드 참조)
	
	
	// 노드가 하나도 없는 비어 있는 연결 리스트 생성
	public LinkedList() {
		head = crnt = null;
	}
	
	// 주어진 조건을 만족하는 노드 검색
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head;	// 현재 스캔중인 노드
		
		while(ptr != null) {
			if(c.compare(obj, ptr.data) == 0) {	// 검색 성공
				crnt = ptr; // 선택 노드에 ptr 값 대입
				return ptr.data;
			}
			ptr = ptr.next;	// 다음 노드 선택
		}
		
		return null;		// 검색 실패
	}
	
	// 머리에 노드 삽입
	public void addFirst(E obj) {
		Node<E> ptr = head;
		head = crnt = new Node<E>(obj, ptr);
	}
	
	// 꼬리에 노드 삽입
	public void addLast(E obj) {
		if(head == null) {	// 리스트가 비어 있으면
			addFirst(obj);	// 머리에 삽입
		} else {
			Node<E> ptr = head;
			while(ptr.next != null) {	// while문 종료시 ptr은 꼬리 노드를 가리킴
				ptr = ptr.next;
			}
			
			ptr.next = crnt = new Node<E>(obj, null);	// 값을 넣고 꼬리 노드가 어떤 노드도 가르키지 않게 함
		}
	}
	
	// 머리 노드를 삭제
	public void removeFirst() {
		if(head != null) {
			head = crnt = head.next;
		}
	}
	
	
	// 꼬리 노드를 삭제
	public void removeLast() {
		if(head != null) {	
			if(head.next == null){	// 노드가 하나만 있으면
				removeFirst();		// 머리 노드를 삭제
			} else {
				Node<E> ptr = head;	// 스캔 중인 노드
				Node<E> pre = head;	// 스캔 중인 노드의 앞쪽 노드
				
				while(ptr.next != null) {	// while문 종료시 ptr은 꼬리 노드를 가리킴
					pre = ptr;			// pre는 꼬리에서 두 번째 노드를 가리킴
					ptr = ptr.next;
				}
				
				pre.next = null;		// pre는 삭제 후 꼬리 노드
				crnt = pre;
			}		
		}
	}
	
	
	// 노드 p를 삭제
	public void remove(Node p) {
		if(head != null) {
			if(p == head) {			// p가 머리 노드면
				removeFirst();		// 머리 노드를 삭제
			} else {
				Node<E> ptr = head;
				
				while(ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) return;	// p가 리스트에 없음
				}
				ptr.next = p.next;
				crnt = ptr;
			}
		}
	}
	
	
	// 선택 노드를 삭제
	public void removeCurrentNode() {
		remove(crnt);
	}
	
	// 모든 노드를 삭제
	public void clear() {
		while(head != null) {
			removeFirst();
		}
		
		crnt = null;
	}
	
	// 선택 노드를 하나 뒤쪽으로 진행
	public boolean next() {
		if(crnt == null || crnt.next == null) {
			return false;
		}
		crnt = crnt.next;
		return true;
	}
	
	// 선택 노드를 출력
	public void printCurrentNode() {
		if(crnt == null) {
			System.out.println("선택한 노드가 없습니다.");
		} else {
			System.out.println(crnt.data);
		}
	}
	
	// 모든 노드를 출력
	public void dump() {
		Node<E> ptr = head;
		
		while(ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}

}
