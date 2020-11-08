import java.util.*;

public class LinkedList<E> implements ListInterface<E>{
	
	private Node<E> head;
	private int numNode;
	
	public LinkedList(){
		head = null;
		numNode = 0;
	}
	
	@Override
	public void addFirst(E item){
		head = new Node <E> (item,head);
		numNode++;
	}
	
	@Override
	public void addAfter(Node<E> curr, E item){
		
	}
	
	@Override
	public void addLast(E item){
		
	}
	
	@Override
	public E removeFirst() throws NoSuchElementException{
		Node<E>ln;
		if (head == null){
			throw new NoSuchElementException("Cant remove from an empty list...");
		}
		else{
			ln = head;
			head = head.getNext();
			numNode--;
			return ln.getData();
		}
	}
	
	@Override
	public E removeAfter(Node<E> curr) throws NoSuchElementException{
		return null;
	}
	
	@Override
	public E removeLast() throws NoSuchElementException{
		return null;
	}
	
	@Override
	public int size(){
		return this.numNode;
	}
	
	@Override
	public boolean contains(E item){
		for(Node<E> node = head; node != null; node=node.getNext()){
			if(node.getData().equals(item))
				return true;
		}
		return false;
	}
	
	@Override
	public void print() throws NoSuchElementException{
		if (head == null)
			throw new NoSuchElementException("Nothing to print");
		
		Node<E> node = head;
		System.out.println("List is: " + node.getData());
		for(int i = 1; i<this.numNode;++i){
			node = node.getNext();
			System.out.print(" " + node.getData());
		}
		System.out.print(".");
	}
	
	public boolean isEmpty(){
		return numNode == 0;
	}
	
	public Node<E> getHead(){
		return this.head;
	}
	
	public E getFirst() throws NoSuchElementException{
		return this.head.getData();
	}
}