//written by P.T.K.Trung

import java.util.*;

public class TestBasicLinkedListFraction {
	public static void main(String [] args){
		BasicLinkedList <Fraction> list = new BasicLinkedList <Fraction>();
		Fraction x, y, z , w;
		x=new Fraction(1,2);
		y=new Fraction(2,3);
		z=new Fraction(3,5);
		list.addFirst(x);
		list.addFirst(y);
		list.addFirst(z);
		list.print();

		System.out.println("Testing removal");
		list.removeFirst();
		list.print();
		w=new Fraction(1,2);
		if (list.contains(w)) 
			w=w.add(y);
			list.addFirst(w);
		list.print();	

	}
}
