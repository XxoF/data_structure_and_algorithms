import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class StackLL<E> implements StackADT<E> {
    
    private MyLinkedList<E> list;

    public StackLL(){
        list = new MyLinkedList<E>();
    }

    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public E peek() throws EmptyStackException{
        try{
            return list.getFirst();
        } catch(NoSuchElementException e){
            throw new EmptyStackException();
        }
    }

    @Override
    public E pop() throws EmptyStackException{
        E obj = peek();
        list.removeFirst();
        return obj;
    }

    @Override
    public void push(E item){
        list.addFirst(item);
    }

}
