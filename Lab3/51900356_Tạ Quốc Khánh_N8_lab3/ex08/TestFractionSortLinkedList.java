import java.util.*;

public class TestFractionSortLinkedList {
	public static void main(String [] args){
		SortLinkedList <Fraction> list = new SortLinkedList <Fraction>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st fraction: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Fraction f1 = new Fraction(a, b);

		System.out.print("Enter 2nd fraction: ");
		a = sc.nextInt();
		b = sc.nextInt();
		Fraction f2 = new Fraction(a, b);

		System.out.print("Enter 3rd fraction: ");
		a = sc.nextInt();
		b = sc.nextInt();
		Fraction f3 = new Fraction(a, b);

		System.out.print("Enter 4th fraction: ");
		a = sc.nextInt();
		b = sc.nextInt();
		Fraction f4 = new Fraction(a, b);

		list.addSortedList_Fraction(f1);
		list.addSortedList_Fraction(f2);
		list.addSortedList_Fraction(f3);
		list.addSortedList_Fraction(f4);

		list.print();
		
	}
}
