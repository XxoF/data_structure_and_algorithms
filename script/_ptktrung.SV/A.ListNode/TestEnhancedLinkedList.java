import java.util.*;

public class TestEnhancedLinkedList {
	public static void main(String [] args) throws NoSuchElementException {

		EnhancedLinkedList <String> list = new EnhancedLinkedList <String>();

		System.out.println("Part 1");
		list.addFirst("aaa");
		list.addFirst("bbb");
		list.addFirst("ccc");
		list.print();

		System.out.println();
		System.out.println("Part 2");
		ListNode <String> current = list.getHead();
		list.addAfter(current, "xxx");
		list.addAfter(current, "yyy");
		list.print();
		//Test removeCurr & remove (E item)

	
	}
}
