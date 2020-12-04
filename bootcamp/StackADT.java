import java.util.*;
public interface StackADT<E> {
    public boolean isEmpty();
    public E peek() throws EmptyStackException;
    public E pop() throws EmptyStackException;
    public void push(E item);
}
