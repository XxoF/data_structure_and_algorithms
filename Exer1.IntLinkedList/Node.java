class Node <E> {
	/* data attributes */
	private int data;
	private Node next;
	/* constructors */
	public Node(int data) { 
		this(data, null); 
	}
	public Node(int item, Node n) { 
		data = item; 
		next = n; 
	}
	/* get the next ListNode */
	public Node getNext() {
		return next;
	}
	/* get the element of the ListNode */
	public int getData() {
		return data;
	}
	/* set the next reference */
	public void setNext(Node n) {
		next = n;
	}
}
