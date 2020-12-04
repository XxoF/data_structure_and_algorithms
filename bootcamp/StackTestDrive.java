import java.util.*;
public class StackTestDrive {
    
    public static void main(String[] args) {
        StackLL<String> stack = new StackLL<String>();

        System.out.println("stack is empty? " + stack.isEmpty());
        stack.push("1");
        stack.push("2");
        System.out.println("top of stack is " + stack.peek());
        stack.push("3");
        System.out.println("top of stack is " + stack.pop());
        stack.push("4");
        stack.pop();
        stack.pop();
        System.out.println("top of stack is " + stack.peek());
    }
}
