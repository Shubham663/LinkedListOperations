package bridgelabz.LinkedListOperations;

import java.util.Scanner;

/**
 * @author Shubham, class defining data structure
 *
 */
public class LinkedList{
	private int size;
	private Node head;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * @author Shubham, class defining an element of Linked List
	 *
	 * @param <T>, generic data type that the linked list stores
	 */
	static class Node<T>{
		private T data;
		private Node next;
		
		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}

		/**
		 * @param data the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	/**
	 * @param <T>, the generic type that linkedlist stores
	 * @param data, the data to be stored
	 */
	public <T> void addNodeAtFirst(T data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
	
	/**
	 * @param <T>, generic type that linkedlist stores
	 * @param data, the data tobe stored
	 */
	public <T> void addNodeAtLast(T data) {
		Node n = new Node(data);
		Node t = head;
		if(t == null){
			head = n;
		}
		else {
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
		size++;
	}
	
	public <T> void addNodeAtIndex(T data) {
		Node n = new Node(data);
		Node t = head;
		System.out.println("Enter the index in [0," + (size) +"] at which you want to add element");
		Scanner sc = new Scanner(System.in);
		int val = sc .nextInt();
		sc.nextLine();
		if(val == 0) {
			addNodeAtFirst(data);
			return;
		}
		for(int i=0; i < val-1  && t!=null; i++)
			t = t.next;
		if(t == null)
		{
			System.out.println("the list is not that long, value within the specified range not given");
			return;
		}
		n.next = t.next;
		t.next = n;
		size++;
	}
	
	/**
	 * prints the linked list
	 */
	public <T> void printList() {
		Node t = head;
		System.out.print("HEAD");
		while(t!=null) {
			System.out.print(" -> " + t.data);
			t = t.next;
		}
		System.out.print(" -> null\n");
	}
	
	/**
	 * @return returns the first element of the linked list
	 */
	public <T> T returnFirst() {
		if(head == null) {
			System.out.println("No elements present");
			return null;
		}
		return (T)head.data;
	}
}