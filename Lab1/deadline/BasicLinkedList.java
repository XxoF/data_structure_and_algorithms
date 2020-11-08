import java.security.NoSuchAlgorithmException;
import java.util.*;

public class BasicLinkedList <E> implements ListInterface <E> {

	// Data attributes
	private ListNode <E> head = null;
	private int num_nodes = 0;
	private ListNode<E> maxNode = null;
	private ListNode<E> minNode = null;

	// Return true if list is empty; otherwise return false.
	public boolean isEmpty() { 
		return (num_nodes == 0); 
	}

	// Return number of nodes in list.
	public int size() { 
		return num_nodes; 
	}

	// Return value in the first node.
	public E getFirst() throws NoSuchElementException {
		if (head == null) 
			throw new NoSuchElementException("can't get from an empty list");
		else return head.getElement();
	}

	// Return true if list contains item, otherwise return false.
	public boolean contains(E item) {
		for (ListNode <E> n = head; n != null; n = n.getNext())
			if (n.getElement().equals(item)) return true;

		return false;
	}

	// Add item to front of list.
	public void addFirst(E item) {
		head = new ListNode <E> (item, head);
		num_nodes++;
	}

	// Remove first node of list.
	public E removeFirst() throws NoSuchElementException {
		ListNode <E> ln;
		if (head == null) 
			throw new NoSuchElementException("can't remove from an empty list");
		else { 
			ln = head;
			head = head.getNext();
			num_nodes--;
			return ln.getElement();
		}
	}

	// Print values of nodes in list.
	public void print() throws NoSuchElementException {
		if (head == null)
			throw new NoSuchElementException("Nothing to print...");

		ListNode <E> ln = head;
		System.out.print("List is: " + ln.getElement());
		for (int i=1; i < num_nodes; i++) {
			ln = ln.getNext();
			System.out.print(", " + ln.getElement());
		}
		System.out.println(".");
	}

	public E getMax(){

		Fraction ans = (Fraction) head.getElement();
		ListNode<E> node = head.getNext();

		for(int i = 1; i<num_nodes;++i){
			Fraction a = (Fraction) node.getElement();
			//Fraction b = (Fraction) a;
			if (a.getData() > ans.getData()){
				ans = (Fraction) a;
			}
				

			node = node.getNext();
		}
		return (E) ans;
		
	}

	public E getMax(){
		
		Fraction ans = (Fraction) head.getElement();
		ListNode<E> node = head.getNext();

		for(int i = 1; i<num_nodes;++i){
			if (ans < node.getElement())
				ans = node.getElement();
				
			node = node.getNext();
		}
		return ans;
		
	}

	public E getMin(){
		Fraction ans = (Fraction) head.getElement();
		ListNode<E> node = head.getNext();

		for(int i = 1; i<num_nodes;++i){
			Fraction a = (Fraction) node.getElement();
			//Fraction b = (Fraction) a;
			if (a.getData() < ans.getData()){
				ans = (Fraction) a;
			}

			node = node.getNext();
		}
		return (E) ans;
	}

	public void removeFraction(Fraction item) throws NoSuchElementException{
		if (head == null)
			throw new NoSuchElementException("Nothing to remove");

		if(contains((E) item) == false) throw new NoSuchElementException("Nothing to remove");
		if(item.equals((Fraction) head.getElement())){
			head = head.getNext();
			num_nodes--;
			return;
		}
		
		ListNode<E> node = head;
		for(int i = 1; i<num_nodes;++i){
			if (item.equals((Fraction) node.getNext().getElement())){
				node.setNext(node.getNext().getNext());
				num_nodes--;
				return;
			}
			node = node.getNext();
		}

	}
}
