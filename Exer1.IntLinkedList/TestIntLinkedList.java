import java.util.*;

public class TestIntLinkedList {
	public static void main(String [] args) 
		                      throws NoSuchElementException {
		IntLinkedList list = new IntLinkedList();

		list.addFirst(34);
		list.addFirst(12);
		list.addFirst(9);
		list.print();

		//System.out.println("Testing removal");
		//list.removeFirst();
		//list.print();
		list.addLast(20);
		list.print();
	}
}
