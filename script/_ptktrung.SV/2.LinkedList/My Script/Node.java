public class Node<E>{
	
	private E element;
	private Node<E> next;
	
	public Node(){
		this(null,null);
	}
	
	public Node(E data){
		this(data,null);
	}
	
	public Node(E data, Node <E> next){
		this.element = data;
		this.next = next;
	}
	
	public E getData(){
		return this.element;
	}
	
	public Node<E> getNext(){
		return this.next;
	}
	
	public void setNext(Node<E>curr){
		this.next = curr;
	}
	
	/*public boolean equals(Object obj){
		if (obj instanceof Node<E>){
			Node<E> node1 = (Node<E>)obj;
			Node<E> node2 = this;
			
			return node1.element == node2.element && node1.next == node2.next;
		}
		else
			return false;
	}
	*/
}