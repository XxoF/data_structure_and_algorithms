import java.util.*;
public class Palindrome{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the String: ");
    String str = sc.nextLine();

    StackLLE<String>stack = new StackLLE<String>();
    QueueLLE<String>queue = new QueueLLE<String>();

    for(int i = 0; i<str.length();++i){
      stack.push(String.valueOf(str.charAt(i)));
      queue.offer(String.valueOf(str.charAt(i)));
    }


    boolean ans = true;
    while(!stack.isEmpty() && !queue.isEmpty() && ans == true){
      //System.out.println(stack.peek() + " " + queue.peek());
      if(!stack.pop().equals(queue.poll()))
        ans = false;
    }
    System.out.println("String is Palindrome:" + ans);
  }
}
