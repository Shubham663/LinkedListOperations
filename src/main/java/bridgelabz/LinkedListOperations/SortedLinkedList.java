package bridgelabz.LinkedListOperations;

public class SortedLinkedList extends LinkedList{
	public <T extends Comparable<T>> void addSortedNode(T val) {
		Node t = this.getHead() , prev = null;
		if(t == null ) {
			Node n =new Node(val);
			this.setHead(n);
			this.setSize(this.getSize()+1);
		}
		else if(t.getData().compareTo(val) > 0 ) {
			this.addNodeAtFirst(val);
		}
		else {
			while(t != null && t.getData().compareTo(val) < 0 ) {
				prev = t;
				t = t.getNext();
			}
			if(t == null)
				this.addNodeAtLast(val);
			else
				this.addNodeAfter(val, prev.getData());
		}
	} 
}