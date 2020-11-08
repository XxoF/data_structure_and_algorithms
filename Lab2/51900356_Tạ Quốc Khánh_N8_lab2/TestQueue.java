import java.util.*;
public class TestQueue {
	public static void main (String[] args) {

		// you can use any one of the following implementation
		//QueueArr <String> queue= new QueueArr <String> (); // Array
		QueueLLE <Fraction> queue= new QueueLLE <Fraction> (); // LinkedList composition
		//QueueLLE <String> queue= new QueueLLE <String> (); // LinkedList inheritance

		Scanner sc = new Scanner(System.in);

		//queue.print();
		System.out.println("Queue is empty?" + queue.isEmpty());

		queue.offer(new Fraction(1,2));
		queue.offer(new Fraction(3,4));
		queue.offer(new Fraction(5,6));
		queue.offer(new Fraction(7,8));

		queue.print();
		System.out.println("Queue is empty?" + queue.isEmpty());

		System.out.println("Top value of queue: " + queue.peek());

		queue.poll();
		queue.print();
		System.out.println("Top value of queue: " + queue.peek());

		queue.poll();
		queue.print();
		System.out.println("Top value of queue: " + queue.peek());

		queue.poll();
		queue.print();
		System.out.println("Top value of queue: " + queue.peek());

	}
}
