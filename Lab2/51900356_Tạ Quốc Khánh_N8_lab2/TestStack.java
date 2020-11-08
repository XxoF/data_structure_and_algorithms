import java.util.*;
public class TestStack {
	public static void main (String[] args) {

		// You can use any of the following 4 implementations of Stack
		//StackArr <String> stack = new StackArr <String>();  // Array
		StackLLE <Fraction> stack = new StackLLE <Fraction>(); // LinkedList composition
		//StackLLE <String> stack = new StackLLE <String>(); // LinkedList inheritance
		//Stack <String> stack = new Stack <String>();  // Java API

		Scanner sc = new Scanner(System.in);

		//stack.print();
		System.out.println("Stack is empty?" + stack.isEmpty());

		stack.push(new Fraction(1,2));
		stack.push(new Fraction(3,4));
		stack.push(new Fraction(5,6));
		stack.push(new Fraction(7,8));

		stack.print();
		System.out.println("stack is empty?" + stack.isEmpty());

		System.out.println("Top value of stack: " + stack.peek());

		stack.pop();
		stack.print();
		System.out.println("Top value of stack: " + stack.peek());

		stack.pop();
		stack.print();

		System.out.println("Top value of stack: " + stack.peek());

		stack.pop();
		stack.print();
		System.out.println("Top value of stack: " + stack.peek());
	}
}
