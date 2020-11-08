import java.util.*;

public class TestBasicLinkedList1 {
	public static void main(String [] args){
		BasicLinkedList <Fraction> list = new BasicLinkedList <Fraction>();
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

		list.addFirst(f1);
		list.addFirst(f2);
		list.addFirst(f3);
		list.addFirst(f4);

		list.print();
		System.out.println("Max = " + list.getMax());
		System.out.println("Min = " + list.getMin());

		System.out.print("Enter fraction you want to remove: ");
		a = sc.nextInt();
		b = sc.nextInt();
		Fraction f5 = new Fraction(a, b);
		
		list.removeFraction(f5);
		list.print();
	}
}
