import java.util.*;

public class TestIntegerSortLinkedList {
	public static void main(String [] args){
		SortLinkedList <Integer> list = new SortLinkedList <Integer>();
		Scanner sc = new Scanner(System.in);
		
        list.addSortedList(1);
        list.addSortedList(3);
        list.addSortedList(5);
        list.addSortedList(2);
        list.addSortedList(4);
        list.addSortedList(10);
        list.addSortedList(-1);
        list.print();
	}
}
