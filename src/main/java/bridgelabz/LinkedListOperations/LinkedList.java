package bridgelabz.LinkedListOperations;

public class LinkedList{
	int size;
	Node head;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	static class Node<T>{
		T data;
		Node next;
		
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	public <T> void addNodeAtFirst(T data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
	
	public <T> void printList() {
		Node t = head;
		System.out.print("HEAD");
		while(t!=null) {
			System.out.print(" -> " + t.data);
			t = t.next;
		}
		System.out.print(" -> null\n");
	}
	
	public <T> T returnFirst() {
		if(head == null) {
			System.out.println("No elements present");
			return null;
		}
		return (T)head.data;
	}
}